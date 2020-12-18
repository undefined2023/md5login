package com.webencyclop.demo.controller;

import com.webencyclop.demo.mappers.MysqlMapper;
import com.webencyclop.demo.model.mysql.AuthUser;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Data
public class MapperDemoController {

    @Autowired
    MysqlMapper mysqlMapper;

    @RequestMapping("/test_mappers")
    public Map<String, String> testMappers() {
        Map<String, String> result = new HashMap<>();
        result.put("Mapper", "Database version");
        result.put("mysqlMapper", mysqlMapper.getVersion());
        return result;
    }

    @RequestMapping("/auth_user")
    public Map<String, String> authUser() {
        Map<String, String> result = new HashMap<>();
        AuthUser au = mysqlMapper.getAuthUser("2");
        String password = au.getPassword();
        result.put("password", password);
        return result;
    }

}
