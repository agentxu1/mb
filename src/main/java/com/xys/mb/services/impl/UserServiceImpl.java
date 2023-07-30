package com.xys.mb.services.impl;

import com.xys.mb.daos.UserDao;
import com.xys.mb.entities.User;
import com.xys.mb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao dao;

    @Override
    public User login(String userName, String password) {
        User loginUser = dao.selectByUserName(userName);
        if (loginUser == null || !Objects.equals(loginUser.getPassword(), password)){
            return null;
        }else{
            return loginUser;
        }
    }
}
