package com.shlock.springboot_mybatis.service.impl;/*
    @author Shlock
    @create date 2020-07-01 21:26    
*/

import com.shlock.springboot_mybatis.dao.UserDao;
import com.shlock.springboot_mybatis.domain.User;
import com.shlock.springboot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
