package com.sunyun.ba07;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("myStudent")
public class Student {

    /**
     * @Value 简单类型属性赋值
     *  属性：value 是String类型的，表示简单类型的属性值
     *  位置：1、在属性定义的上面，无需要set方法，推荐使用
     *       2、在set方法的上面
     *
     *
     */
    @Value(value = "孙昀")
    private String name;
    @Value(value = "23")
    private Integer age;

    /**
     *
     * 引用类型
     * @Resource 来自jdk中的注解，spring框架提供类对这个注解功能的支持，可以使用他给引用类型的赋值
     *           使用的也是自动注入原理，支持byname，bytpye，默认是byname
     *   位置：
     *         1、在属性的定义上面，不需要set方法
     *         2、在set方法的上面
     *
     *  默认先使用byname自动注入，如果byname失败，再使用bytype
     *
     * @Resource 只使用byname ，需要增加属性 name
     *           name的值是bean的名称
     *
     * @return
     */

    //只使用byname方式
    @Resource(name ="myXuexiao")
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
