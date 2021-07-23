package com.wh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wh.entity.User;

import java.util.List;

/**
 * @program: maven-modules
 * @description:
 * @author: wh
 * @create: 2021-07-12 13:51
 **/
public interface UserMapper extends BaseMapper<User> {

    /**
     * 获取
     * @return
     */
   List<User> selectAll();
}
