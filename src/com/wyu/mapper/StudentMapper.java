package com.wyu.mapper;

import com.wyu.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectAllStudentSumDESC();

    List<Student> selectAllStudent();
    Integer signIn(Student student);

}
