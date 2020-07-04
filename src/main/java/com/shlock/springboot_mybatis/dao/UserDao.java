package com.shlock.springboot_mybatis.dao;/*
    @author Shlock
    @create date 2020-07-01 21:19    
*/

import com.shlock.springboot_mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
//@Mapper标记该类是一个mybatis的mapper接口，可以被spring boot自动扫描到spring上下文中
public interface UserDao{
    public List<User> findAll();
}