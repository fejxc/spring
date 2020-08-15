package com.sunyun.service.imple;

import com.sunyun.service.SomeService;
import com.sunyun.util.ServiceTools;

import java.util.Date;

//Service类的代码不修改，也可以增加额外的功能，输出时间，事务。
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
      // ServiceTools.dolog(); 后加的不再这里出现，保持原来的代码不该动
        System.out.println("执行业务方法doSome");
       // ServiceTools.doTrans();
    }

    @Override
    public void doOther() {
       // ServiceTools.dolog();
        System.out.println("执行业务方法doOther");
        //ServiceTools.doTrans();


    }
}
