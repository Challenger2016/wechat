package org.vision.wechat.service;

import org.vision.wechat.common.ResponseData;
import org.vision.wechat.model.CheckRecordGetListBO;
import org.vision.wechat.persistence.model.VisionCheckReportPO;

import com.github.pagehelper.PageInfo;

public interface CheckRecordPOService {
  
  ResponseData<PageInfo<CheckRecordGetListBO>> list(CheckRecordGetListBO bo);
  
  ResponseData<VisionCheckReportPO> find(String id);
  
  
}
