package com.xys.mb.controllers;

import com.xys.mb.daos.UserDao;
import com.xys.mb.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    UserDao dao;

    @GetMapping("/")
    public String index(){
        User user = dao.selectByUserId(1l);
        return user.toString();
    }
}
