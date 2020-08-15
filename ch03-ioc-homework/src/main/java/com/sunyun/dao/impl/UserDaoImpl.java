package com.sunyun.dao.impl;

import com.sunyun.dao.UserDao;
import com.sunyun.domain.SysUser;

public class UserDaoImpl implements UserDao {

    @Override
    public void insertUser(SysUser user) {
        System.out.println("user插入mysql----");
    }
}
