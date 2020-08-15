package com.sunyun.ba05;

public class Student {
    private String name;
    private int age;

    //声明一个引用类型
    private School school; //引用类型数据

    public Student(String name, int age) {
        this.name=name;
        this.age=age;
    }


    public void setSchool(School school) {
        this.school = school;
    }

    public Student(){
        System.out.println("spring会调用无参数构造方法创建对象");
    }

    public void setName(String name) { //spring只执行类set方法
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
