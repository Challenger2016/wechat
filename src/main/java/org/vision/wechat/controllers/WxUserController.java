package org.vision.wechat.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.vision.wechat.common.RedisClient;
import org.vision.wechat.common.ResponseData;
import org.vision.wechat.persistence.model.WxUserPO;
import org.vision.wechat.service.WxMiniprgmService;
import org.vision.wechat.service.WxUserService;

import io.swagger.annotations.Api;

@RequestMapping("/wx-user")
@RestController
@Api(value="微信用户")
public class WxUserController{
  
  @Autowired
  private WxMiniprgmService WxMiniprgmService;
  
  @Autowired
  private WxUserService wxUserService;
  
  @Autowired
  private HttpServletRequest httpServletRequest;
  
  @Autowired
  private RedisClient redisClient;
  
  @PostMapping(value = "/is-register")
  @ResponseBody
  public ResponseData<Boolean> isRegister() {
     
    String wechatSessionId = httpServletRequest.getHeader(HttpConstants.WECHAT_SESSION_ID);
    boolean exists = redisClient.exists(wechatSessionId + "_user");
    
    ResponseData<Boolean> responseData = new ResponseData<>();
    responseData.setData(exists);
    
    return responseData;
  }
  
  @PostMapping(value = "/register")
  @ResponseBody
  public ResponseData<Object> isRegister(@RequestBody WxUserPO wxUserPO) {
     
    String wechatSessionId = httpServletRequest.getHeader(HttpConstants.WECHAT_SESSION_ID);
    
    
    return wxUserService.register(wechatSessionId, wxUserPO);
  }
  
  @PostMapping(value = "/get-details")
  @ResponseBody
  public ResponseData<WxUserPO> byCode() {
     
    String wechatSessionId = httpServletRequest.getHeader(HttpConstants.WECHAT_SESSION_ID);
    
    return wxUserService.getDetail(wechatSessionId);
  }
  
  @PostMapping(value = "/update")
  @ResponseBody
  public ResponseData<Object> update(@RequestBody WxUserPO wxUserPO) {
     
    String wechatSessionId = httpServletRequest.getHeader(HttpConstants.WECHAT_SESSION_ID);
    
    return wxUserService.update(wechatSessionId, wxUserPO);
  }

}
