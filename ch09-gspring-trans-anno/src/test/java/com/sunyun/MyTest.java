package com.sunyun;

import com.sunyun.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器获取service
        BuyGoodsService service = (BuyGoodsService) ac.getBean("buyService");
        System.out.println(service.getClass().getName());
        //
        service.buy(1002,10);

    }
}
