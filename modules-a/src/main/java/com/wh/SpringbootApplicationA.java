package com.wh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: maven-modules
 * @description:
 * @author: wh
 * @create: 2021-07-08 09:34
 **/
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.wh.dao")
public class SpringbootApplicationA {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplicationA.class);
    }
}
