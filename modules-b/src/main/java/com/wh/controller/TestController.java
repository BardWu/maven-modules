package com.wh.controller;

import com.wh.myInterface.AModulesApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: maven-modules
 * @description:
 * @author: wh
 * @create: 2021-07-08 17:37
 **/
@RestController
@RequestMapping("test1")
public class TestController {

    public TestController(){
        System.out.println("init");
    }

    @Resource
    private AModulesApi aModulesApi;

    @RequestMapping("test1")
    public String test1(){
        return aModulesApi.test1();
    }
}
