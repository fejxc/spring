package com.sunyun.util;

import java.util.Date;

public class ServiceTools {
    public static void dolog(){
        System.out.println("方法执行的时间"+new Date());
    }
    public static void doTrans(){
        //方法的最好提交事务
        System.out.println("方法执行完成，提交事务");
    }
}
