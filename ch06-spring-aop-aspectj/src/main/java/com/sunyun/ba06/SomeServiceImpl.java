package com.sunyun.ba06;


import com.sunyun.ba02.Student;

//目标类
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name,Integer age) {

        //给doSome（）方法增加功能  在dosome执行之前，输出时间
        System.out.printf("====目标方法doSome()====");


    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("====目标方法doOther()====");
        return "abcd";
    }

    @Override
    public Student doOther2(String name, Integer age) {
        Student student = new Student();
        student.setName("sunyun");
        student.setAge(22);
        return student;
    }

    @Override
    public String doFist(String name, Integer age) {

        System.out.println("====业务方法doFist()====");
        return null;
    }

    @Override
    public void doSecond() {
        System.out.println("执行业务方法doSecond()"+10/0);
    }

    @Override
    public void doThird() {
        System.out.println("执行业务方法doThrid");
    }
}
