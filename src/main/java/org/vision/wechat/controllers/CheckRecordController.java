package org.vision.wechat.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.vision.wechat.common.RedisClient;
import org.vision.wechat.common.ResponseData;
import org.vision.wechat.common.SysResponseEnum;
import org.vision.wechat.model.CheckRecordGetListBO;
import org.vision.wechat.persistence.model.CheckRecordPO;
import org.vision.wechat.persistence.model.WxUserPO;
import org.vision.wechat.service.CheckRecordPOService;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.Api;

@RequestMapping("/check-record")
@RestController
@Api(value="检测记录")
public class CheckRecordController{
  
  @Autowired
  private CheckRecordPOService checkRecordPOService;
  
  @Autowired
  private HttpServletRequest httpServletRequest;
  
  @Autowired
  private HttpServletResponse httpServletResponse;
  
  @Autowired
  private RedisClient redisClient;
  
  @PostMapping(value = "/list")
  @ResponseBody
  public ResponseData<PageInfo<CheckRecordPO>> list(@RequestBody CheckRecordGetListBO bo) {
     
    ResponseData<PageInfo<CheckRecordPO>> responseData = new ResponseData<>();
    
    String wechatSessionId = httpServletRequest.getHeader(HttpConstants.WECHAT_SESSION_ID);
    Object object = redisClient.get(wechatSessionId + "_user");
    if (object == null) {
      responseData.setCode(SysResponseEnum.NOT_LOGIN.getCode());
      responseData.setMessage(SysResponseEnum.NOT_LOGIN.getMessage());
      return responseData;
    }
    
    WxUserPO wxUserPO = (WxUserPO) object;
    bo.setWxUserId(wxUserPO.getWxUserId());
    
    return checkRecordPOService.list(bo);
  }
  
  @PostMapping(value = "/find/{checkRecordId}")
  @ResponseBody
  public ResponseData<CheckRecordPO> find(@PathVariable("checkRecordId") Integer checkRecordId) { 
    
    return checkRecordPOService.find(checkRecordId);
  }
  

  


}
