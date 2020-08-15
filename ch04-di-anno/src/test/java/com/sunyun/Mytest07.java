package com.sunyun;

import com.sunyun.ba07.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest07 {
    @Test
    public void test01(){
        String config="applicationContextMytest07.xml";
        ApplicationContext ac =new ClassPathXmlApplicationContext(config);
       Student student= (Student) ac.getBean("myStudent");
        System.out.println("student="+student);
    }
}
