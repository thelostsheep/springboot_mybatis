package com.shlock.springboot_mybatis.controller;/*
    @author Shlock
    @create date 2020-07-01 10:56    
*/

import com.shlock.springboot_mybatis.domain.User;
import com.shlock.springboot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//等价于@Controller + @ResponseBody
public class QuickStartController {

    @Autowired
    UserService userService;

    @RequestMapping("/quick")
    public List<User> quick() {
        return userService.findAll();
    }
}

