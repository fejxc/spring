package com.sunyun;

import com.sunyun.dao.StudentDao;
import com.sunyun.domain.Student;
import com.sunyun.service.StudentService;
import com.sunyun.service.StudentServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Mytest {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        String names[] = ac.getBeanDefinitionNames();
        for (String name:names){
            System.out.println("容器中对象的名称为："+name+"|"+ac.getBean(name));
        }


    }
    @Test
    public void testDaoInsert(){
        String config="applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
       StudentDao dao = (StudentDao) ac.getBean("studentDao");
        Student student = new Student();
        student.setId(1006);
        student.setName("孙雨");
        student.setEmail("sunyun@qq.com");
        student.setAge(14);

        int nums =dao.insertStudent(student);
        System.out.println("nums="+nums);


    }
    @Test
    public void testDaoSelect(){
        String config="applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentDao dao = (StudentDao) ac.getBean("studentDao");
        List<Student> list = new ArrayList<>();
        list=dao.selectStudents();
        for(Student st:list){
            System.out.println(st);
        }
    }

    @Test
    public void testServiceInsert(){
        String config="applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService studentService = (StudentService) ac.getBean("studentService");
        Student student = new Student();
        student.setId(1007);
        student.setName("美丽");
        student.setEmail("meili@qq.com");
        student.setAge(38);

        int nums =studentService.addStudent(student);
        System.out.println("nums="+nums);
        /**
         * spring和mybatis整合在一起使用，事务是自动提交的饿，不用执行SqlSession.commit();
         */

    }
    @Test
    public void testServiceSelect(){
        String config="applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService studentService = (StudentService) ac.getBean("studentService");
        List<Student> list = new ArrayList<>();
        list=studentService.queryStudent();
        for(Student st:list){
            System.out.println(st);
        }
    }


}
