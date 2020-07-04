package com.shlock.springboot_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.sql.SQLException;



@EnableScheduling
@EnableTransactionManagement
@MapperScan("com.shlock.springboot_mybatis.dao")
@SpringBootApplication
public class SpringbootMybatisApplication {

    public static void main(String[] args) throws SQLException {

        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

}
