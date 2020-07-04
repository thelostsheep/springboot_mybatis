package com.shlock.springboot_mybatis;

import com.shlock.springboot_mybatis.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;


@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    UserService userService;

    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {
        userService.findAll().forEach(System.out::println);
    }

    public void aaaa(){}
    @Test
    void test1(){
        System.out.println(dataSource.getClass());
    }

}
