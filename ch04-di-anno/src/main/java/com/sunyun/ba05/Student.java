package com.sunyun.ba05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Value(value = "孙昀")
    private String name;
    @Value(value = "23")
    private Integer age;

    /**
     *
     * 引用类型
     * @Autowired : spring框架提供的注解，实现引用类型的赋值。
     * Spring中通过注解给引用类型赋值，使用的自动注入原理
     * 支持ByName，ByType
     *
     * 属性：required ，是一个boolean类型的，默认为true
     *  required = true ：表示说引用类型如果赋值失败，程序报错，并终止执行。  （ 用true更合适 ）
     *  required = false :引用类型如果赋值失败，程序正常执行，引用类型是null
     *
     * @Autowired 默认使用的是ByType的规则
     *
     *  位置：1、在属性定义的位置上面，不需要set方法，推荐使用
     *       2、在set方法上面
     *
     * 如果使用ByName 方式：
     * 1、在属性上面加入@Autowred
     * 2、在属性上面加入@Qualifier(value="bean的id"） ，表示用指定的bean完成赋值
     * @return
     */
    @Autowired(required = true)
    @Qualifier("myXuexiao")
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
