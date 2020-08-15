package com.sunyun.service.imple;

import com.sunyun.dao.UserDao;
import com.sunyun.domain.SysUser;
import com.sunyun.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao dao = null;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void addUser(SysUser user) {
        dao.insertUser(user);
    }
}
