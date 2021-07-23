package com.wh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: maven-modules
 * @description:
 * @author: wh
 * @create: 2021-07-09 10:00
 **/
@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEurekaApplication.class);
    }
}
