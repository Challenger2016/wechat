package org.vision.wechat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vision.wechat.common.RedisClient;
import org.vision.wechat.common.ResponseData;
import org.vision.wechat.persistence.mapper.WxUserPOMapper;
import org.vision.wechat.persistence.model.WxUserPO;
import org.vision.wechat.persistence.model.WxUserPOExample;
import org.vision.wechat.service.WxUserService;

import com.alibaba.fastjson.JSONObject;

@Service
public class WxUserServiceImpl implements WxUserService {

  @Autowired
  private WxUserPOMapper wxUserPOMapper;
  
  @Autowired
  private RedisClient redisClient;
  
  @Override
  public ResponseData<Object> register(String wechatSessionId, WxUserPO wxUserPO) {

    JSONObject jsonObject = (JSONObject) redisClient.get(wechatSessionId);
    String openid = jsonObject.getString("openid");
    wxUserPO.setOpenId(openid);
    
    wxUserPOMapper.insertSelective(wxUserPO);
    
    redisClient.set(wechatSessionId + "_user", wxUserPO, 2678400L);
    return new ResponseData<>();
  }

  @Override
  public ResponseData<WxUserPO> getDetail(String wechatSessionId) {
    JSONObject jsonObject = (JSONObject) redisClient.get(wechatSessionId);
    String openid = jsonObject.getString("openid");

    return this.getDetailByOpenid(openid);
  }

  @Override
  public ResponseData<WxUserPO> getDetailByOpenid(String openid) {
    WxUserPOExample example = new WxUserPOExample();
    example.createCriteria().andOpenIdEqualTo(openid);
    
    List<WxUserPO> list = wxUserPOMapper.selectByExample(example);
    WxUserPO wxUserPO = null;
    if (list != null && list.size() > 0) {
      wxUserPO = list.get(0);
      wxUserPO.setOpenId(null);
    }
    
    ResponseData<WxUserPO> responseData = new ResponseData<>();
    responseData.setData(wxUserPO);
    return responseData;
  }

  @Override
  public ResponseData<Object> update(String wechatSessionId, WxUserPO wxUserPO) {
    JSONObject jsonObject = (JSONObject) redisClient.get(wechatSessionId);
    String openid = jsonObject.getString("openid");
    wxUserPO.setOpenId(openid);
    
    wxUserPO.setOpenId(null);
    wxUserPO.setWxUserId(null);
    
    WxUserPOExample example = new WxUserPOExample();
    example.createCriteria().andOpenIdEqualTo(openid);
    
    wxUserPOMapper.updateByExampleSelective(wxUserPO, example);
    return new ResponseData<>();
  }

  

}
