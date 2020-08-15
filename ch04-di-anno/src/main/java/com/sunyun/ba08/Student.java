package com.sunyun.ba08;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {

    /**
     * @Value 简单类型属性赋值
     *  属性：value 是String类型的，表示简单类型的属性值
     *  位置：1、在属性定义的上面，无需要set方法，推荐使用
     *       2、在set方法的上面
     */

    @Value("${myname}")
    private String name;

    @Value("${myage}")
    private Integer age;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
