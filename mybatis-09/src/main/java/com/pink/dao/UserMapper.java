package com.pink.dao;

import com.pink.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User queryUserById(@Param("id") int id);

    int updateUser(User user);
}
