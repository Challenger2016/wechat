package org.vision.wechat.controllers;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.vision.wechat.common.ResponseData;
import org.vision.wechat.service.WxMiniprgmService;

import io.swagger.annotations.Api;

@RequestMapping("/wx-miniprgm")
@RestController
@Api(value="微信小程序相关接口")
public class WxMiniprgmController{
  
  @Autowired
  private WxMiniprgmService WxMiniprgmService;
  
  @RequestMapping(value = "/by-code")
  @ResponseBody
  public ResponseData<String> byCode(@NotNull @RequestParam("code") String code) {
     
    
    return WxMiniprgmService.byCode(code);
  }

}
