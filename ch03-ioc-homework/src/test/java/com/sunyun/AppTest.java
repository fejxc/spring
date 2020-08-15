package com.sunyun;

import static org.junit.Assert.assertTrue;

import com.sunyun.domain.SysUser;
import com.sunyun.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;
import java.util.Date;

/**
 * Unit test for simple App.
 */

public class AppTest 
{
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService userService =(UserService) ac.getBean("userService");
        SysUser user = new SysUser();
        user.setAge(20);
        user.setName("孙昀");
        userService.addUser(user);
       // System.out.println(userService);

//        UserService userService2 =(UserService) ac.getBean("userService");
//        SysUser user2 = new SysUser();
//        user.setAge(22);
//        user.setName("孙华");
//        userService2.addUser(user2);
        /**
         * user插入mysql----
         * user插入mysql----
         * 因为Spring是单例原则
         */
    }


}

