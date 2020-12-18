package com.webencyclop.demo.config;

import com.webencyclop.demo.mappers.MysqlMapper;
import com.webencyclop.demo.mappers.SqlserverMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.inject.Named;
import javax.sql.DataSource;

@Configuration
public class MyBatisConfiguration {

    // bean name
    private static final String MYSQL_SESSION_FACTORY = "mysqlSessionFactory";
    private static final String SQLSERVER_SESSION_FACTORY = "sqlserverSessionFactory";

    @Primary
    @Bean(name = MYSQL_SESSION_FACTORY, destroyMethod = "")
    public SqlSessionFactoryBean mysqlSqlSessionFactory(@Named(DatabaseConfiguration.MYSQL_DATASOURCE) final DataSource thirdDataSource)
            throws Exception {
        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(thirdDataSource);
        final SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBean.getObject();
        sqlSessionFactory.getConfiguration().addMapper(MysqlMapper.class);
        return sqlSessionFactoryBean;
    }

    @Bean(name = SQLSERVER_SESSION_FACTORY, destroyMethod = "")
    public SqlSessionFactoryBean sqlserverSqlSessionFactory(@Named(DatabaseConfiguration.SQLSERVER_DATASOURCE) final DataSource fourthDataSource)
            throws Exception {
        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(fourthDataSource);
        final SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBean.getObject();
        sqlSessionFactory.getConfiguration().addMapper(SqlserverMapper.class);
        return sqlSessionFactoryBean;
    }

    @Bean
    public MapperFactoryBean<MysqlMapper> mysqlMapper(@Named(MYSQL_SESSION_FACTORY) final SqlSessionFactoryBean sqlSessionFactoryBean)
            throws Exception {
        MapperFactoryBean<MysqlMapper> factoryBean = new MapperFactoryBean<>(MysqlMapper.class);
        factoryBean.setSqlSessionFactory(sqlSessionFactoryBean.getObject());
        return factoryBean;
    }

    @Bean
    public MapperFactoryBean<SqlserverMapper> sqlserverMapper(@Named(SQLSERVER_SESSION_FACTORY) final SqlSessionFactoryBean sqlSessionFactoryBean)
            throws Exception {
        MapperFactoryBean<SqlserverMapper> factoryBean = new MapperFactoryBean<>(SqlserverMapper.class);
        factoryBean.setSqlSessionFactory(sqlSessionFactoryBean.getObject());
        return factoryBean;
    }

}