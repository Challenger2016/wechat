package org.vision.wechat.persistence.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table vision_check_record
 */
@Data
public class VisionCheckRecordPO implements Serializable {
    /**
     * Database Column Remarks:
     *   主键id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.id
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.vision_client_id
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private String visionClientId;

    /**
     * Database Column Remarks:
     *   左右眼：OD-左眼，OS-右眼
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.eye_type
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private String eyeType;

    /**
     * Database Column Remarks:
     *   检测日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.check_date
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private Date checkDate;

    /**
     * Database Column Remarks:
     *   数据类型：0x01-数字，0x02-图像，图像只有一幅，图像类型时，左右眼标识忽略
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.data_type
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private Boolean dataType;

    /**
     * Database Column Remarks:
     *   图片文件名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.picture_file
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private String pictureFile;

    /**
     * Database Column Remarks:
     *   瞳孔大小
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.pupil
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private BigDecimal pupil;

    /**
     * Database Column Remarks:
     *   CYL-等效球面度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.se1
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private BigDecimal se1;

    /**
     * Database Column Remarks:
     *   CYL-球面度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.ds1
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private BigDecimal ds1;

    /**
     * Database Column Remarks:
     *   CYL-柱面度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.dc1
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private BigDecimal dc1;

    /**
     * Database Column Remarks:
     *   CYL-柱面轴位角
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.axis1
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private Integer axis1;

    /**
     * Database Column Remarks:
     *   CYL+等效球面度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.se2
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private BigDecimal se2;

    /**
     * Database Column Remarks:
     *   CYL+球面度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.ds2
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private BigDecimal ds2;

    /**
     * Database Column Remarks:
     *   CYL+柱面度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.dc2
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private BigDecimal dc2;

    /**
     * Database Column Remarks:
     *   CYL+柱面轴位角
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.axis2
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private Integer axis2;

    /**
     * Database Column Remarks:
     *   瞳距
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.pd
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private Integer pd;

    /**
     * Database Column Remarks:
     *   眼压
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.mm_hg
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private BigDecimal mmHg;

    /**
     * Database Column Remarks:
     *   水平固视
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.gaze_h
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private Integer gazeH;

    /**
     * Database Column Remarks:
     *   垂直固视
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.gaze_v
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private Integer gazeV;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.remark
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private String remark;

    /**
     * Database Column Remarks:
     *   数据有效性：1=有效；0=无效
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.enabled
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private Boolean enabled;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.create_time
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vision_check_record.modified_time
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private Date modifiedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table vision_check_record
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    private static final long serialVersionUID = 1L;
}