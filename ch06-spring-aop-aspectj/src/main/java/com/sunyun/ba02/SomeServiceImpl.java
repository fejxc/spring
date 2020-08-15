package com.sunyun.ba02;


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
}
