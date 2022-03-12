package com.pink.dao;

import com.pink.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //根据ID查询用户
    User getUserById(int id);

    //分页查询
    List<User> getUserByLimit(Map<String,Integer> map);

    List<User> getUserByRowBounds();


}
