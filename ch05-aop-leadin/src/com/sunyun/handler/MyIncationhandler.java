package com.sunyun.handler;

import com.sunyun.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyIncationhandler implements InvocationHandler {

    //目标对象
    private Object target; //SomeServiceImpl类

    public MyIncationhandler(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //通过代理对象，在执行方法时候，调用这个invoke（ ）
        System.out.println("执行MyIncationHandler的invoke()方法");
        System.out.println("method="+method.getName());

        String methodName = method.getName();
        Object res = null;
        if("doSome".equals(methodName)){
            ServiceTools.dolog(); //在方法之前输出时间
            //执行目标类的方法，通过Method类实现
            res = method.invoke(target,args); //SomeServiceImpl.doSome()
            ServiceTools.doTrans();//方法执行之后，提交事务
            //目标方法的执行结果
        }else {
            res = method.invoke(target,args); //SomeServiceImpl.doOther()
        }


        return res;
    }
}
