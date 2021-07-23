package com.wh.myInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: maven-modules
 * @description:
 * @author: wh
 * @create: 2021-07-09 14:41
 **/
@FeignClient(value = "Modules-a")
public interface AModulesApi {

    @RequestMapping("test1/test1")
    String test1();

}
