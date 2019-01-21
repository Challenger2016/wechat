package org.vision.wechat.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vision.wechat.common.DateUtils;
import org.vision.wechat.common.ResponseData;
import org.vision.wechat.model.CheckRecordGetListBO;
import org.vision.wechat.persistence.mapper.CheckRecordPOMapper;
import org.vision.wechat.persistence.model.CheckRecordPO;
import org.vision.wechat.persistence.model.CheckRecordPOExample;
import org.vision.wechat.persistence.model.CheckRecordPOExample.Criteria;
import org.vision.wechat.service.CheckRecordPOService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CheckRecordPOServiceImpl implements CheckRecordPOService {

  @Autowired
  private CheckRecordPOMapper checkRecordPOMapper;
  
  @Override
  public ResponseData<PageInfo<CheckRecordPO>> list(CheckRecordGetListBO bo) {
    PageHelper.offsetPage(bo.getPageNum(), bo.getPageSize());
    
    Integer wxUserId = bo.getWxUserId();
    String checkDateStart = bo.getCheckDateStart();
    String checkDateEnd = bo.getCheckDateEnd();
    
    CheckRecordPOExample example = new CheckRecordPOExample();
    example.setOrderByClause(" check_record_id desc");
    Criteria createCriteria = example.createCriteria();
    createCriteria.andWxUserIdEqualTo(wxUserId);
    if (StringUtils.isNotBlank(checkDateStart)) {
      createCriteria.andCheckDateGreaterThanOrEqualTo(DateUtils.string2Date(checkDateStart + " 00:00:00"));
    }
    if (StringUtils.isNotBlank(checkDateEnd)) {
      createCriteria.andCheckDateLessThanOrEqualTo(DateUtils.string2Date(checkDateEnd + " 23:59:59"));
    }
    
    List<CheckRecordPO> list = checkRecordPOMapper.selectByExample(example);
    
    ResponseData<PageInfo<CheckRecordPO>> responseData  = new ResponseData<>();
    responseData.setData(new PageInfo<>(list));
    
    return responseData;
  }

  @Override
  public ResponseData<CheckRecordPO> find(Integer checkRecordId) {
    CheckRecordPO checkRecordPO = checkRecordPOMapper.selectByPrimaryKey(checkRecordId);
    
    ResponseData<CheckRecordPO> responseData = new ResponseData<CheckRecordPO>();
    responseData.setData(checkRecordPO);
    return responseData;
  }

}
