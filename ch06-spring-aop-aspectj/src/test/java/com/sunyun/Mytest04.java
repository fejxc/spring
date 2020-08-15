package com.sunyun;

import com.sunyun.ba04.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest04 {
    @Test
    public void test01(){
        String config="applicationContext04.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
       SomeService proxy = (SomeService) ac.getBean("someService");

       //通过代理对象执行方法，实现目标方法执行时，增强类功能
        String str = proxy.doFist("lisi",99);
       // System.out.println("str===="+str);



    }
}
