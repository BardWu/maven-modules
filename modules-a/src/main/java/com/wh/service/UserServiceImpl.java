package com.wh.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wh.dao.UserMapper;
import com.wh.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: maven-modules
 * @description:
 * @author: wh
 * @create: 2021-07-12 15:35
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
