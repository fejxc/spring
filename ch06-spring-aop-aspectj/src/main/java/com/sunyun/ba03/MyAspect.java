package com.sunyun.ba03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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
     *环绕通知方法的定义格式
     * 1、pulic
     * 2、必须有一个返回值，推荐Object
     * 3、方法名称自定义
     * 4、方法有参数，是固定的参数 ProceedingJoinPoint
     *
     */


    /**
     *
     * @Around：环绕通知
     * 属性：value 切入点表达式
     * 位置：在方法定义上面
     * 特点：
     * 1、他是最强的通知
     * 2、在目标方法前和后都能增强功能
     * 3、能控制目标方法是否被调用执行
     * 4、修改原来的目标方法的执行结果，影响最后的调用结果
     *
     *
     * 环绕通知 ，等同于jdk的动态代理 ，Invocationhandler接口
     *
     * 参数：ProceedingJoinPoint 等同于 Method
     *      作用；执行目标方法
     * 返回值：目标方法的执行结果，可以被修改
     *
     * 环绕通知：经常做事务，在目标方法之前开始事务，方法结束后提交事务
     *
     * @param pjp
     * @return
     */

    //ProceedingJoinPoint 继承 JoinPoint 所以可以直接用pjp获取参数信息
    @Around(value = "execution(* *..SomeServiceImpl.doFist(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        //获取第一个参数值
        String name="";
        Object args[] = pjp.getArgs();
        if(args!=null && args.length>1){
           Object arg =  args[0];
           name=(String)arg;

        }
        //实现环绕通知
        Object res=null;
        System.out.println("环绕通知：在目标方法之前，输出时间："+new Date());
        //1.符合条件，目标方法的调用
        if("lisi".equals(name)){
            res = pjp.proceed(); //method.invoke(); res= doFist();
        }

        System.out.println("环绕通知：在目标方法之后，提交事务");
        //2在目标方法前后增加功能

        //修改目标方法的执行结果，影响方法最后的调用结果
        if(res != null){
            res = "hello aop!";
        }

        //返回目标方法执行的结果
        return res;

    }
}
