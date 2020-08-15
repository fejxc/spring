package com.sunyun.ba02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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
     * 后置定义方法，方法是实现切面功能
     * 方法定义的要求：
     * 1、公共的方法 public
     * 2、方法没有返回值
     * 3、方法名称自定义
     * 4、方法可以有参数,参数推荐使用Object，参数名称自定义
     *
     */


    /**
     * @AfterReturing：后置通知
     *  属性：1、value 切入点表达式
     *       2、returing 自定义的变量，表示目标方法的返回值
     *         自定义变量名必须和通知方法的形参名一模一样 res
     *
     *  位置：在方法定义的上
     *
     *  特点：
     *      1、在方法执行后执行的
     *      2、能够获取到目标方法的返回值，可以根据这个返回值做不用的处理
     *          Object res = doOther();
     *      3、可以修改返回值
     *
     *  后置通知的执行
     *         Object res = doOther();
     *         参数传递：传值，传引用
     *         myAfterReturing(res);
     *
     *
     * @param res
     */

    @AfterReturning(value = "execution(* *..SomeService.doOther(..))",returning = "res")
    public void myAfterReturing(JoinPoint jp,Object res){
        //Object res 是目标方法执行方法执行后的返回值，根据返回值做处理
        System.out.println("后置通知方法的定义"+jp.getSignature().getName());
        System.out.println("后置通知，在目标方法后执行，获取的返回值是："+res);
        if(res.equals("abcd")){
            //做一些功能
        }else {
            //做一些其他功能
        }

        //修改目标方法的返回值，看看会不会影响最终方法的调用,对程序结果没有影响
        if(res != null){
            res="Hello Aspectj";
        }
    }


    //小作业
    @AfterReturning(value = "execution(* *..SomeService.doOther2(..))",returning = "res")
    public void myAfterReturing2(JoinPoint jp,Object res){
        //Object res 是目标方法执行方法执行后的返回值，根据返回值做处理

        System.out.println("后置通知方法的定义"+jp.getSignature().getName());
        System.out.println("后置通知，在目标方法后执行，获取的返回值是："+res);

        //修改目标方法的返回值，看看会不会影响最终方法的调用,对程序结果没有影响
        //如果修改类res的内容，属性值等，会不会影响最后的调用结果

    }
}
