package com.jihelife.mapper;

import com.jihelife.pojo.ReqParameter;
import com.jihelife.pojo.TSmsSignature;
import com.jihelife.pojo.TSmsSignatureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSmsSignatureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_signature
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    long countByExample(TSmsSignatureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_signature
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    int deleteByExample(TSmsSignatureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_signature
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    int insert(TSmsSignature record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_signature
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    int insertSelective(TSmsSignature record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_signature
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    List<TSmsSignature> selectByExample(TSmsSignatureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_signature
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    int updateByExampleSelective(@Param("record") TSmsSignature record, @Param("example") TSmsSignatureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_signature
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    int updateByExample(@Param("record") TSmsSignature record, @Param("example") TSmsSignatureExample example);


    TSmsSignature querySmsSignBySite(@Param("param") ReqParameter reqParameter);
}