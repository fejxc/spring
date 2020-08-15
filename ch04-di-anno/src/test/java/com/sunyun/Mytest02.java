package com.sunyun;

import com.sunyun.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest02 {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ac =new ClassPathXmlApplicationContext(config);
       Student student= (Student) ac.getBean("mystudent");
        System.out.println("student="+student);
    }
}
