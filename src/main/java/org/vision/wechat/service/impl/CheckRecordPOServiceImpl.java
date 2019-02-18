package org.vision.wechat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vision.wechat.common.ResponseData;
import org.vision.wechat.model.CheckRecordGetListBO;
import org.vision.wechat.persistence.mapper.VisionCheckReportPOMapper;
import org.vision.wechat.persistence.model.VisionCheckReportPO;
import org.vision.wechat.service.CheckRecordPOService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CheckRecordPOServiceImpl implements CheckRecordPOService {
  
  @Autowired
  private VisionCheckReportPOMapper visionCheckReportPOMapper;
  
  @Override
  public ResponseData<PageInfo<CheckRecordGetListBO>> list(CheckRecordGetListBO bo) {
    PageHelper.offsetPage(bo.getPageNum(), bo.getPageSize());
    
    List<CheckRecordGetListBO> list = visionCheckReportPOMapper.list(bo);
    
    ResponseData<PageInfo<CheckRecordGetListBO>> responseData  = new ResponseData<>();
    responseData.setData(new PageInfo<>(list));
    
    return responseData;
  }

  @Override
  public ResponseData<VisionCheckReportPO> find(String id) {
    VisionCheckReportPO po = visionCheckReportPOMapper.selectByPrimaryKey(id);
    
    ResponseData<VisionCheckReportPO> responseData = new ResponseData<VisionCheckReportPO>();
    responseData.setData(po);
    return responseData;
  }

}
