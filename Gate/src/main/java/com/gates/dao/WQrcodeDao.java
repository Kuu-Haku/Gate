package com.gates.dao;

import com.gates.entity.WQrcode;

public interface WQrcodeDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_qrcode
     *
     * @mbggenerated Wed Jan 31 17:05:03 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_qrcode
     *
     * @mbggenerated Wed Jan 31 17:05:03 CST 2018
     */
    int insert(WQrcode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_qrcode
     *
     * @mbggenerated Wed Jan 31 17:05:03 CST 2018
     */
    int insertSelective(WQrcode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_qrcode
     *
     * @mbggenerated Wed Jan 31 17:05:03 CST 2018
     */
    WQrcode selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_qrcode
     *
     * @mbggenerated Wed Jan 31 17:05:03 CST 2018
     */
    int updateByPrimaryKeySelective(WQrcode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_qrcode
     *
     * @mbggenerated Wed Jan 31 17:05:03 CST 2018
     */
    int updateByPrimaryKey(WQrcode record);
    
    WQrcode getOne();
}