package com.wh.controller;

import com.wh.dao.UserMapper;
import com.wh.entity.User;
import com.wh.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: maven-modules
 * @description:
 * @author: wh
 * @create: 2021-07-08 09:32
 **/

@RestController
@RequestMapping("test1")
public class TestController {

    @Autowired
    private UserServiceImpl userMapper;

    public TestController(){
        System.out.println("init");
    }
    @RequestMapping("test1")
    public List<User> test1(){
        return userMapper.selectAll();
    }

}
