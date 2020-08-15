package com.sunyun;

import com.sunyun.handler.MyIncationhandler;
import com.sunyun.service.SomeService;
import com.sunyun.service.imple.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class MyApp {
    public static void main(String[] args) {
//        //调用doSome doOteher
//        SomeService service = new SomeServiceImpl();
//        service.doSome();
//        System.out.println("=======================");
//        service.doOther();

        //使用jdk的Proxy创建代理对象
        //创建目标对象
        SomeService taget =new SomeServiceImpl();

        //创建InvocationHandler对象
        InvocationHandler handler = new MyIncationhandler(taget);

        //使用Proxy创建代理
        SomeService proxy =(SomeService)Proxy.newProxyInstance(taget.getClass().getClassLoader(),
                taget.getClass().getInterfaces(),handler);

        //通过代理执行方法，调用handler🀄️的invoke方法
        proxy.doSome();
        System.out.println("++++++++++++++++++++++++++++++++++");
        proxy.doOther();



        //需求 ：  只要doSome的时候需要增强方法

    }
}
