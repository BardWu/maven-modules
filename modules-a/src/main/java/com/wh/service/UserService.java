package com.wh.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wh.entity.User;

import java.util.List;

/**
 * @program: maven-modules
 * @description:
 * @author: wh
 * @create: 2021-07-12 15:31
 **/
public interface UserService extends IService<User> {

    List<User> selectAll();
}
