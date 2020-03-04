package com.example.dao;

import com.example.dataobject.UserDo;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Feb 16 21:26:28 GMT+08:00 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Feb 16 21:26:28 GMT+08:00 2020
     */
    int insert(UserDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Feb 16 21:26:28 GMT+08:00 2020
     */
    int insertSelective(UserDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Feb 16 21:26:28 GMT+08:00 2020
     */
    UserDo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Feb 16 21:26:28 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(UserDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Feb 16 21:26:28 GMT+08:00 2020
     */
    int updateByPrimaryKey(UserDo record);
}