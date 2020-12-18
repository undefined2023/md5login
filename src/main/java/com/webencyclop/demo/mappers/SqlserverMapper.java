package com.webencyclop.demo.mappers;

import com.webencyclop.demo.model.sqlserver.Mrbaseinf;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SqlserverMapper {

    @Select("select @@version")
    String getVersion();

    @Select("select *, EmpID as empId from mrbaseinf where loginID = #{LoginID}")
    Mrbaseinf getUserByLoginId(@Param("LoginID") String loginId);

}
