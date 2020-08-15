package com.sunyun.ba01;

public class Student {
    private String name;
    private int age;
    public Student(){
        System.out.println("spring会调用无参数构造方法创建对象");
    }

    public void setEmail(String eamil){
        System.out.println("setEamil="+eamil);
    }

    public void setName(String name) { //spring只执行类set方法
        System.out.println("setName:"+name+"测试调用set方法");
        this.name = name.toUpperCase();
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
