package com.sunyun;

import com.sunyun.ba07.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest07 {
    @Test
    public void test01(){
        String config="applicationContext07.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
       SomeServiceImpl proxy = (SomeServiceImpl) ac.getBean("someService");
/**
 *
 * 目标类没有接口，使用CGLIB动态代理，spring框架会自动应用chlib
 * com.sunyun.ba07.SomeServiceImpl$$EnhancerBySpringCGLIB$$ebf7fffb
 */
        System.out.println(proxy.getClass().getName());
        //EnhancerBySpringCGLIB$$ebf7fffb
      proxy.doThird();



    }
}
