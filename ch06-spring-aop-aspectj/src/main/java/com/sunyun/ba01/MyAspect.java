package com.sunyun.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


import java.util.Date;

/**
 * @Aspect：aspectj框架中的注解
 *          作用：表示当前类死切面类
 *          切面类：用来给当前业务方法增强功能的类，在这个类中有切面的功能代码
 *          位置：在类的定义上面
 *
 */
@Aspect
public class MyAspect {
    /**
     * 定义方法，方法是实现切面功能
     * 方法定义的要求：
     * 1、公共的方法 public
     * 2、方法没有返回值
     * 3、方法名称自定义
     * 4、方法可以有参数，也可没有参数
     *      如果有参数，参数不是自定义的，有几个参数类型可以使用
     */

    /**
     * @Before ：前置通知
     *
     * 属性：value，是切入点表达式，表示切面的功能执行位置
     * 位置：方法上面
     *
     * 特点：
     * 1、在目标方法之前执行
     * 2、不会改不目标方法执行的结果
     * 3、不会影响目标方法的执行
     *
     * execution表示位置
     *  @Before表示时间
     */


    /**
     *
     * 切面表达式的多种写法
     */
//    @Before(value = "execution(public void com.sunyun.ba01.SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore(){
//        // 切面要执行的功能代码
//        System.out.printf("前置通知，切面功能：在目标方法之前，输出一个执行时间："+new Date()+"\n");
//    }


//    @Before(value = "execution(void com.sunyun.ba01.SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore(){
//        // 切面要执行的功能代码
//        System.out.printf("前置通知，切面功能：在目标方法之前，输出一个执行时间："+new Date()+"\n");
//    }

//    @Before(value = "execution(void *..SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore(){
//        // 切面要执行的功能代码
//        System.out.printf("前置通知，切面功能：在目标方法之前，输出一个执行时间："+new Date()+"\n");
//    }

//    @Before(value = "execution(* *..SomeServiceImpl.*(..))")
//    public void myBefore(){
//        // 切面要执行的功能代码
//        System.out.printf("前置通知，切面功能：在目标方法之前，输出一个执行时间："+new Date()+"\n");
//    }
//
//    @Before(value = "execution(* do*(..))")
//    public void myBefore2(){
//        // 切面要执行的功能代码
//        System.out.printf("2---前置通知，切面功能：在目标方法之前，输出一个执行时间："+new Date()+"\n");
//    }


    /**
     * 指定通知方法中的参数 ：JoinPoint
     * JoinPoint代表的是业务方法，要加入切面功能的业务方法
     *  作用是：可以在通知方法获取执行方法时的信息，例如方法的名称，方法的实参数
     *  如果你的切面功能中需要用到方法的信息，就要假日JoinPoint
     *  这个JoinPoint参数的值是由框架赋予的，必须是第一个位置参数
     */
    @Before(value = "execution(* do*(String,Integer))")
    public void myBefore(JoinPoint jp){
        //  获取方法完整的定义
        System.out.println("方法的签名（定义）="+jp.getSignature());
        System.out.println("方法名称="+jp.getSignature().getName());
        Object args [] = jp.getArgs();
        for(Object arg:args)
        {
            System.out.println("方法实参="+arg);
        }

        // 切面要执行的功能代码
        System.out.printf("前置通知，切面功能：在目标方法之前，输出一个执行时间："+new Date()+"\n");
    }
}
