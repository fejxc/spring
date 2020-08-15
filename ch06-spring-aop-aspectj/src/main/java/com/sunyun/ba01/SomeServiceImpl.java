package com.sunyun.ba01;


//目标类
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name,Integer age) {

        //给doSome（）方法增加功能  在dosome执行之前，输出时间
        System.out.printf("====目标方法doSome()====");


    }
}
