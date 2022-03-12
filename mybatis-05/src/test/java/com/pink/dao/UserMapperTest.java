package com.pink.dao;


import com.pink.pojo.User;
import com.pink.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        /*User user = mapper.getUserById(1);
        System.out.println(user);
        int i = mapper.addUser(new User(6, "六号", "123456"));
        if (i>0){
            System.out.println("插入成功！");
        }
        int i = mapper.updateUser(new User(6, "六号修改", "456789"));
        if (i>0){
            System.out.println("修改成功！");
        }
        int i = mapper.deleteUser(9);
        if (i>0){
            System.out.println("删除成功!");
        }*/
        sqlSession.close();
    }
}
