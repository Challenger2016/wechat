package org.vision.wechat.persistence.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_sys_dictionary
 */
@Data
public class SysDictionaryPO implements Serializable {
    /**
     * Database Column Remarks:
     *   主键id示例8888
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dictionary.sys_dictionary_id
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    private Integer sysDictionaryId;

    /**
     * Database Column Remarks:
     *   code
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dictionary.code
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    private String code;

    /**
     * Database Column Remarks:
     *   类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dictionary.type
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    private String type;

    /**
     * Database Column Remarks:
     *   名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dictionary.name
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    private String name;

    /**
     * Database Column Remarks:
     *   值
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dictionary.value
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    private String value;

    /**
     * Database Column Remarks:
     *   显示顺序
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dictionary.sort
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    private Long sort;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dictionary.remark
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    private String remark;

    /**
     * Database Column Remarks:
     *   创建人id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dictionary.create_user_id
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    private Integer createUserId;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dictionary.create_user_name
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    private String createUserName;

    /**
     * Database Column Remarks:
     *   创建日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dictionary.create_date
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   修改人id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dictionary.modified_user_id
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    private Integer modifiedUserId;

    /**
     * Database Column Remarks:
     *   修改人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dictionary.modified_user_name
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    private String modifiedUserName;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dictionary.modified_date
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    private Date modifiedDate;

    /**
     * Database Column Remarks:
     *   数据有效性：1=有效；0=无效
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dictionary.valid
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    private Boolean valid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sys_dictionary
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    private static final long serialVersionUID = 1L;
}