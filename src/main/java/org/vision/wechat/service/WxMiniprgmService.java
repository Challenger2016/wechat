package org.vision.wechat.service;

import org.vision.wechat.common.ResponseData;

public interface WxMiniprgmService {
  
  ResponseData<String> byCode(String code);
}
