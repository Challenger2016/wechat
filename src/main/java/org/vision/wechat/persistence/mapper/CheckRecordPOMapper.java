package org.vision.wechat.persistence.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.vision.wechat.persistence.model.CheckRecordPO;
import org.vision.wechat.persistence.model.CheckRecordPOExample;

@Mapper
public interface CheckRecordPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_record
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    long countByExample(CheckRecordPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_record
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    int deleteByExample(CheckRecordPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_record
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    int deleteByPrimaryKey(Integer checkRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_record
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    int insert(CheckRecordPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_record
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    int insertSelective(CheckRecordPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_record
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    List<CheckRecordPO> selectByExample(CheckRecordPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_record
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    CheckRecordPO selectByPrimaryKey(Integer checkRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_record
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    int updateByExampleSelective(@Param("record") CheckRecordPO record, @Param("example") CheckRecordPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_record
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    int updateByExample(@Param("record") CheckRecordPO record, @Param("example") CheckRecordPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_record
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    int updateByPrimaryKeySelective(CheckRecordPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_record
     *
     * @mbg.generated Mon Jan 21 10:15:48 CST 2019
     */
    int updateByPrimaryKey(CheckRecordPO record);
}