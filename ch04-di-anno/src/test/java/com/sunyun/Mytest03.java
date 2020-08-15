package com.sunyun;

import com.sunyun.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest03 {
    @Test
    public void test01(){
        String config="applicationContextMytest03.xml";
        ApplicationContext ac =new ClassPathXmlApplicationContext(config);
       Student student= (Student) ac.getBean("mystudent");
        System.out.println("student="+student);
    }
}
