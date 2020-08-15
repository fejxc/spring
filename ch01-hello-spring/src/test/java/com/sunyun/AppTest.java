package com.sunyun;

import com.sunyun.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Unit test for simple App.
 */

public class AppTest 
{
    /**
     * 对象的创建时机：
     * spring在加载配置文件时候，就将bean中的所有对象创建完成，存放在map中
     *
     * 一个bean标签，代表一个对象
     *
     * spring创建对象调用的是无参构造方法，反射机制创建对象；
     */
    @Test
    public void test01(){
        SomeService service = new SomeServiceImpl();
        service.doSome();

    }

    @Test
    public void test02(){
        //指定spring容器创建的对象
        //指定spring配置文件的名称
        String config= "beans.xml";
        //创建表示spring容器的对象，ApplicationContext，表示spring容器，通过容器对象获取对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //ClassPathXmlApplicationContext 从类路径加载配置文件

        //用getBean方法 从容器中获取
        SomeService service =(SomeService) ac.getBean("someService");

        //使用创建好的对象
        service.doSome();



    }

    /**
     *获取spring容器中 java 对象的信息
     */
    @Test
    public void test03(){
        String config= "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //使用spring提供的方法，获取容器定义的数量
       int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象数量:"+nums);
        //容器中每个对象定义的名称
        String names[] = ac.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
    }

    //获取一个非自定义类的对象,例如Date，已经存在的类对象
    @Test
    public void test04(){
        String config= "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //使用getBean
        Date my = (Date) ac.getBean("mydate");
        System.out.println("Date:"+my);
    }
}

