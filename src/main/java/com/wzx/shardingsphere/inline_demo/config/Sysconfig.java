package com.wzx.shardingsphere.inline_demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Calendar;

/**
 *
 *
 * @Description:
 * @Project:
 * @CreateDate: Created in 2019-07-02 18:05
 * @Author: <a href="695310480@qq.com">wangzhengxi</a>
 */
@Configuration
@Order(1)
public class Sysconfig {


    @Resource
    private DataSource dataSource;
}
