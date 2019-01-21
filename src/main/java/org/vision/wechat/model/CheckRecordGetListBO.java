package org.vision.wechat.model;

public class CheckRecordGetListBO {
  
  private Integer wxUserId;
  
  @io.swagger.annotations.ApiModelProperty(value = "检测日期区间起始", name = "checkDateStart", required = false, example = "")
  private String checkDateStart;
  
  @io.swagger.annotations.ApiModelProperty(value = "检测日期区间闭合", name = "checkDateEnd", required = false, example = "")
  private String checkDateEnd;
  
  private int pageNum;
  
  private int pageSize;

  public int getPageNum() {
    return pageNum;
  }

  public void setPageNum(int pageNum) {
    this.pageNum = pageNum;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public String getCheckDateStart() {
    return checkDateStart;
  }

  public void setCheckDateStart(String checkDateStart) {
    this.checkDateStart = checkDateStart;
  }

  public String getCheckDateEnd() {
    return checkDateEnd;
  }

  public void setCheckDateEnd(String checkDateEnd) {
    this.checkDateEnd = checkDateEnd;
  }

  public Integer getWxUserId() {
    return wxUserId;
  }

  public void setWxUserId(Integer wxUserId) {
    this.wxUserId = wxUserId;
  }
  
  
}
