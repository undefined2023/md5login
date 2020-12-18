package com.webencyclop.demo.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    // bean name
    public static final String MYSQL_DATASOURCE = "mysqlDatasource";
    public static final String SQLSERVER_DATASOURCE = "sqlserverDatasource";

    @Primary
    @Bean(name = MYSQL_DATASOURCE, destroyMethod = "")
    @ConfigurationProperties(prefix = "spring.mysqldatasource")
    public DataSource mysqlDataSource() {
        return new HikariDataSource();
    }

    @Bean(name = SQLSERVER_DATASOURCE, destroyMethod = "")
//    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource sqlserverDataSource() {

//        return new HikariDataSource();

        // 这里相当于不用上面那种 “从properties里面获取值” 的方法来设置 datasource 了！
        // 而是直接在 java 里面设置了

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://192.168.22.22:1433;databaseName=ioffice");
        dataSource.setUsername("sa");
        dataSource.setPassword("346966258");
        return dataSource;

    }

}