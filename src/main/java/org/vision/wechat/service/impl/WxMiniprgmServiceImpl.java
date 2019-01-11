package org.vision.wechat.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vision.wechat.common.RedisClient;
import org.vision.wechat.common.ResponseData;
import org.vision.wechat.common.SysResponseEnum;
import org.vision.wechat.sdk.WxMiniprgmSDK;
import org.vision.wechat.service.WxMiniprgmService;

import com.alibaba.fastjson.JSONObject;

@Service
public class WxMiniprgmServiceImpl implements WxMiniprgmService {

  @Autowired
  private WxMiniprgmSDK wxMiniprgmService;
  
  @Autowired
  private RedisClient redisClient;
  
  @Override
  public ResponseData<String> byCode(String code) {
    
    ResponseData<String> responseData = new ResponseData<>();
    
    JSONObject jsonObject = wxMiniprgmService.getJscode2Session(code);
    if (jsonObject == null) {
      responseData.setCode(SysResponseEnum.WX_MINIGRGM_JSCODE_SESSION.getCode());
      responseData.setMessage(SysResponseEnum.WX_MINIGRGM_JSCODE_SESSION.getMessage());
      return responseData;
    }
    
    String wechatSessionId = UUID.randomUUID().toString();
    redisClient.set(wechatSessionId, jsonObject, 2678400L);
    
    responseData.setData(wechatSessionId);
    
    return responseData;
  }

}
