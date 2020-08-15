package com.sunyun.controller;

import com.sunyun.domain.Student;
import com.sunyun.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决中文乱码问题
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String strId = request.getParameter("id");
        String strName = request.getParameter("name");
        String strEmail = request.getParameter("email");
        String strAge = request.getParameter("age");

        //创建spring的容器对象
        //String config= "spring.xml";
       // ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        WebApplicationContext ac = null;
        //获取ServletContext中容器对象，创建好的容器对象，拿来就用


//        String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
//       Object attr = getServletContext().getAttribute(key);
//       if(attr!=null){
//           ac = (WebApplicationContext)attr;
//       }

        //使用框架中的方法，获取对象
        ServletContext sc = getServletContext();

        ac = WebApplicationContextUtils.getRequiredWebApplicationContext(sc);

        System.out.println("容器对象的信息===="+ac);

        //获取service
        StudentService service= (StudentService) ac.getBean("studentService");
        Student student = new Student();
        student.setId(Integer.parseInt(strId));
        student.setName(strName);
        student.setEmail(strEmail);
        student.setAge(Integer.valueOf(strAge)); //valueOf调用的是parseInt
        service.addStudent(student);

        //给一个页面
        request.getRequestDispatcher("/result.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
