package com.hc.spring6.di.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author HuangChi
 * @since 2024/2/19
 */
@Slf4j
public class JdbcTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-jdbc.xml");
        DruidDataSource druidDataSource = context.getBean("druidDataSource", DruidDataSource.class);
        DruidPooledConnection connection = null;
        try {
            connection = druidDataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        log.info(connection.toString());
        log.info(druidDataSource.getDriverClassName());
        log.info(druidDataSource.getUrl());
        log.info(druidDataSource.getUsername());
        log.info(druidDataSource.getPassword());
    }

}
