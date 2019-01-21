package org.vision.wechat.service;

import org.vision.wechat.common.ResponseData;
import org.vision.wechat.model.CheckRecordGetListBO;
import org.vision.wechat.persistence.model.CheckRecordPO;

import com.github.pagehelper.PageInfo;

public interface CheckRecordPOService {
  
  ResponseData<PageInfo<CheckRecordPO>> list(CheckRecordGetListBO bo);
  
  ResponseData<CheckRecordPO> find(Integer checkRecordId);
  
  
}
