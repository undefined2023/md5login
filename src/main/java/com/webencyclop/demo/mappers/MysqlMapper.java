package com.webencyclop.demo.mappers;

import com.webencyclop.demo.model.mysql.AuthUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MysqlMapper {

    @Select("SELECT VERSION()")
    String getVersion();

//    @Select("SELECT *, first_name as firstName, last_name as lastName FROM xemc.auth_user")
//    AuthUser getAllUsers();

    @Select("select * from xemc.auth_user where auth_user_id = #{id}")
    AuthUser getAuthUser(@Param("id") String id); // use String instead of int

}
