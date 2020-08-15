package com.sunyun.ba03;

public class Student {
    private String name;
    private int age;

    //声明一个引用类型
    private School school;

    public void setSchool(School school) {
        this.school = school;
    }

    public Student(){
        System.out.println("spring会调用无参数构造方法创建对象");
    }

    /**
     * 有参数构造方法
     * @param name
     */
    public Student (String myname,int myage,School myschool){
        System.out.println("Student类有参数构造方法=======");
        this.name=myname;
        this.age=myage;
        this.school=myschool;
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
