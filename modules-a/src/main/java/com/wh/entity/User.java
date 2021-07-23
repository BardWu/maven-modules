package com.wh.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @program: maven-modules
 * @description:
 * @author: wh
 * @create: 2021-07-12 13:51
 **/
@Data
@TableName("user")
public class User {

    private Long id;
    private String name;
    private Integer age;
    private String email;

}
