package com.sunyun.ba04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

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
     *
     *异常知方法的定义格式
     * 1、pulic
     * 2、没有返回值
     * 3、方法名称自定义
     * 4、有一个参数Exception(必须有)，还有参数就是JoinPoint、
     *
     */

    /**
     * @AfterThrowing：异常通知
     *  属性：1、value 切入点表达式
     *       2、thhrowing 自定义的变量，表示目标方法抛出的异常对象
     *       变量名必须和方法参数名一样  ex
     *
     *
     *  特点：
     *      1、在目标方法抛出异常的时候执行
     *      2、可以做异常的监控程序，监控目标方法执行时候是不是有异常
     *      有异常的话，就可以发邮件通知
     *
     *
     *      执行就是：
     *      try{
     *          SomServiceImpl.doSecond();
     *      }catch(Exception e){
     *          myAfterThrowing(e);
     *      }
     *
     *
     *
     *
     */
    @AfterThrowing(value = "execution(* *..SomeServiceImpl.doSecond(..))",throwing = "ex")
    public void myAfterThrowing(Exception ex){
        System.out.println("异常通知：方法发生异常时候执行："+ex.getMessage());
        //发送邮件或者短信

    }

}
