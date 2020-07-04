package com.shlock.springboot_mybatis.service;/*
    @author Shlock
    @create date 2020-07-01 21:26    
*/

import com.shlock.springboot_mybatis.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    @Transactional
    public List<User> findAll();
}
