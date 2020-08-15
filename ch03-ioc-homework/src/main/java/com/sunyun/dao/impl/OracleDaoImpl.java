package com.sunyun.dao.impl;

import com.sunyun.dao.UserDao;
import com.sunyun.domain.SysUser;

public class OracleDaoImpl implements UserDao {
    @Override
    public void insertUser(SysUser user) {
        System.out.println("使用Oracle数据库插入");
    }
}
