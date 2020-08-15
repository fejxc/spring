package com.sunyun;

import com.sunyun.ba08.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest08 {
    @Test
    public void test01(){
        String config="applicationContextMytest08.xml";
        ApplicationContext ac =new ClassPathXmlApplicationContext(config);
       Student student= (Student) ac.getBean("myStudent");
        System.out.println("student="+student);
    }
}
