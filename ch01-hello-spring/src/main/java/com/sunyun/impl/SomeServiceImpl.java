package com.sunyun.impl;

import com.sunyun.SomeService;

public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl(){
        System.out.println("无参构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("实现类SomeServecede doSome方法");
        //sout输出语句
    }
}
