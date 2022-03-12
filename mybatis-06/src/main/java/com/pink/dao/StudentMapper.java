package com.pink.dao;

import com.pink.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有的学生的信息，以及对应的老师的信息
    List<Student> getStudents();
    List<Student> getStudents2();
}
