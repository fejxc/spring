package com.sunyun;

import com.sunyun.ba05.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest05 {
    @Test
    public void test01(){
        String config="applicationContext05.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
       SomeService proxy = (SomeService) ac.getBean("someService");

      proxy.doThird();



    }
}
