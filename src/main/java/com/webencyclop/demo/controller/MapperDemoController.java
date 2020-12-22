package com.webencyclop.demo.controller;

import com.webencyclop.demo.mappers.MysqlMapper;
import com.webencyclop.demo.model.mysql.AuthUser;
import com.webencyclop.demo.model.mysql.Fileinfo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    @RequestMapping("/get_all_file_info")
    public List<Map<String, Object>> getAllFileinfo() {

        List<Fileinfo> fis = mysqlMapper.getAllFileinfo(); // query
        List<Map<String, Object>> result = new ArrayList<>();
        for (Fileinfo fi : fis) {
            Map<String, Object> model = new HashMap<>();
            model.put("name", fi.getName());
            model.put("size", fi.getSize());
            model.put("upload_date", fi.getUpload_date());
            result.add(model);
        }

        return result;

    }

}
