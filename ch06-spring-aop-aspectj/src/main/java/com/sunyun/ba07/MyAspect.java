package com.sunyun.ba07;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Aspect：aspectj框架中的注解
 *          作用：表示当前类死切面类
 *          切面类：用来给当前业务方法增强功能的类，在这个类中有切面的功能代码
 *          位置：在类的定义上面
 *
 */
@Aspect
public class MyAspect {

    @After(value = "mypt()")
    public void myAfter(){
        System.out.println("执行最终通知，总是会被执行");

        //一般做资源清除的工作
    }

    @Before(value = "mypt()")
    public void myBefore(){
        System.out.println("前置通知，在目标方法之前会被执行");

    }

    /**
     *
     * @Pointcut :定义和管理切入点，如果项目中有许多切入点表达式是重复的，可以复用的。
     *              可以使用@Pointcut
     *   属性：value 切入点表达式
     *   位置：在自定义方法上面
     *
     *   特点：
     *   当使用@Pointcut 定义在一个方法上面，此时这个歌方法的名称就是切入点表达式的别名，其他的通知中value，可以使用这个方法的名称
     *   代替切入点表达式
     *
     *
     */

    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
    private void mypt(){
        //无需要代码

    }

}
