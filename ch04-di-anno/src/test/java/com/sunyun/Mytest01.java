package com.sunyun;

import com.sunyun.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest01 {
    @Test
    public void test01(){
        String config="applicationContextMytest01.xml";
        ApplicationContext ac =new ClassPathXmlApplicationContext(config);
       Student student= (Student) ac.getBean("mystudent");
        System.out.println("student="+student);
    }
}
