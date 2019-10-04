package com.wyu.testPackage;

import com.wyu.mapper.StudentMapper;
import com.wyu.pojo.Student;
import com.wyu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestDemo {

    @Test
    public void test01() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.selectAllStudentSumDESC();
        for (Student student : studentList) {
            System.out.println(student);
        }

        MyBatisUtils.closeSqlSession(sqlSession);
    }


    @Test
    public void test02() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.selectAllStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }

        MyBatisUtils.closeSqlSession(sqlSession);
    }

    @Test
    public void test03() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setId(100);
        student.setPhone("1911110");
        student.setUsername("01MRHCNE10");

        System.out.println(student);

        System.out.println("------" + mapper.signIn(student));
        sqlSession.commit();

        MyBatisUtils.closeSqlSession(sqlSession);
    }


}
