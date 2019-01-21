package org.vision.wechat.service;

import org.vision.wechat.common.ResponseData;
import org.vision.wechat.persistence.model.WxUserPO;

public interface WxUserService {
  
  ResponseData<Object> register(String wechatSessionId, WxUserPO wxUserPO);
  
  ResponseData<WxUserPO> getDetail(String wechatSessionId);
  
  ResponseData<WxUserPO> getDetailByOpenid(String openid);
  
  ResponseData<Object> update(String wechatSessionId, WxUserPO wxUserPO);
  
  
}
