package com.wyu.servlet;

import com.wyu.mapper.StudentMapper;
import com.wyu.pojo.Student;
import com.wyu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletLogin")
public class ServletLogin extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        System.out.println("ServletLogin");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;utf-8");

        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String phone = request.getParameter("phone");
        System.out.println(id+"-------"+username+"==========="+phone);


        Student student = new Student();
        student.setId(Integer.parseInt(id));
        student.setUsername(username);
        student.setPhone(phone);


        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        int signInFlag = 0;
                mapper.signIn(student);
        String info = "sign Fail";
        if (signInFlag > 1) {
            info = "Sign Success";
        }
        PrintWriter writer = response.getWriter();
        writer.write(info);
        writer.close();

    }
}
