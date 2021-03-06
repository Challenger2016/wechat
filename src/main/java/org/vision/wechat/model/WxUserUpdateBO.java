package org.vision.wechat.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class WxUserUpdateBO  implements Serializable {
  /**
   * Database Column Remarks:
   *   姓名
   *
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column t_wx_user.name
   *
   * @mbg.generated Mon Jan 21 10:15:48 CST 2019
   */
  private String name;

  /**
   * Database Column Remarks:
   *   性别,女：0 男：1
   *
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column t_wx_user.gender
   *
   * @mbg.generated Mon Jan 21 10:15:48 CST 2019
   */
  private String gender;

  /**
   * Database Column Remarks:
   *   年龄
   *
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column t_wx_user.age
   *
   * @mbg.generated Mon Jan 21 10:15:48 CST 2019
   */
  private Integer age;

  /**
   * Database Column Remarks:
   *   生日
   *
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column t_wx_user.birth_day
   *
   * @mbg.generated Mon Jan 21 10:15:48 CST 2019
   */
  private Date birthDay;

  /**
   * Database Column Remarks:
   *   身份证号
   *
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column t_wx_user.id_nember
   *
   * @mbg.generated Mon Jan 21 10:15:48 CST 2019
   */
  private String idNember;

  /**
   * Database Column Remarks:
   *   省份
   *
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column t_wx_user.province
   *
   * @mbg.generated Mon Jan 21 10:15:48 CST 2019
   */
  private String province;

  /**
   * Database Column Remarks:
   *   城市
   *
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column t_wx_user.city
   *
   * @mbg.generated Mon Jan 21 10:15:48 CST 2019
   */
  private String city;

  /**
   * Database Column Remarks:
   *   区县
   *
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column t_wx_user.county
   *
   * @mbg.generated Mon Jan 21 10:15:48 CST 2019
   */
  private String county;

  /**
   * Database Column Remarks:
   *   详细地址
   *
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column t_wx_user.detail_address
   *
   * @mbg.generated Mon Jan 21 10:15:48 CST 2019
   */
  private String detailAddress;

  /**
   * Database Column Remarks:
   *   监护人
   *
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column t_wx_user.guardian_name
   *
   * @mbg.generated Mon Jan 21 10:15:48 CST 2019
   */
  private String guardianName;

  /**
   * Database Column Remarks:
   *   监护关系：1-父亲，2-母亲，10-其他
   *
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column t_wx_user.guardian_relation
   *
   * @mbg.generated Mon Jan 21 10:15:48 CST 2019
   */
  private String guardianRelation;

  /**
   * Database Column Remarks:
   *   监护人手机号
   *
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column t_wx_user.guardian_phone
   *
   * @mbg.generated Mon Jan 21 10:15:48 CST 2019
   */
  private String guardianPhone;

  /**
   * Database Column Remarks:
   *   监护人微信号
   *
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column t_wx_user.guardian_wechat
   *
   * @mbg.generated Mon Jan 21 10:15:48 CST 2019
   */
  private String guardianWechat;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database table t_wx_user
   *
   * @mbg.generated Mon Jan 21 10:15:48 CST 2019
   */
  private static final long serialVersionUID = 1L;
}  
