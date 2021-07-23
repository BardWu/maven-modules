package com.wh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: maven-modules
 * @description:
 * @author: wh
 * @create: 2021-07-08 17:40
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringBootApplicationB {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationB.class);
    }
}
