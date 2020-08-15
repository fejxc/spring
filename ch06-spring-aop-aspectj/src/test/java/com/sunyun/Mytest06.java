package com.sunyun;

import com.sunyun.ba06.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest06 {
    @Test
    public void test01(){
        String config="applicationContext06.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
       SomeService proxy = (SomeService) ac.getBean("someService");

        System.out.println(proxy.getClass().getName());
      proxy.doThird();



    }
}
