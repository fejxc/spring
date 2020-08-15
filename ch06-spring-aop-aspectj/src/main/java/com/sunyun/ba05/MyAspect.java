package com.sunyun.ba05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

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
     *最终通知方法的定义格式
     * 1、pulic
     * 2、没有返回值
     * 3、方法名称自定义
     * 4、方法没有参数，有参数就是一个JoinPoint、
     *
     */

    /**
     * @After:最终通知
     *  属性：value 切入点表达式
     *  位置：在方法上面
     *
     *  特点：
     *  1、总是会执行
     *  2、在目的方法之后执行的
     *
     *  try{
     *
     *  }catch{
     *
     *  }finally{
     *      myAfter();
     *  }
     *
     */
    @After(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void myAfter(){
        System.out.println("执行最终通知，总是会被执行");

        //一般做资源清除的工作
    }

}
