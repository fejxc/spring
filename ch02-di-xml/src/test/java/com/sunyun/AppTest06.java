package com.sunyun;

import com.sunyun.ba06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App. 单元测试，一个工具类库，做测试
 * 单元：指定的是方法，一个类中有很多方法，一个方法叫一个单元
 *
 * 使用单元测试：
 *  1、需要加入junit依赖
 *     <dependency>
 *       <groupId>junit</groupId>
 *       <artifactId>junit</artifactId>
 *       <version>4.11</version>
 *       <scope>test</scope>
 *     </dependency>
 *  2、创建测试作用的类：叫测试类
 *      src/test/java/目录下创建类
 *  3、创建测试方法
 *      1）公共的方法
 *      2）没有返回值
 *      3）方法名称自定义，建议命名是 test+测试方法的名称
 *      4）方法没有参数
 *      5）方法的上面要加 @Test （注解），这样的方法是可以单独执行的，而不用使用main方法
 *
 */

public class AppTest06
{
    /**
     * 先执行无参数构造方法，再调用set方法
     */
    @Test
    public void test01(){
        System.out.println("=========test01=========");
        //指定spring容器创建的对象
        //指定spring配置的总文件的名称
        String config= "ba06/total.xml";
        //创建表示spring容器的对象，ApplicationContext，表示spring容器，通过容器对象获取对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //ClassPathXmlApplicationContext 从类路径加载配置文件

        Student myStudent = (Student)ac.getBean("myStudent");
        System.out.println(myStudent);

    }



}

