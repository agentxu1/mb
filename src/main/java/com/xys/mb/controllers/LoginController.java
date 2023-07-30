package com.xys.mb.controllers;

import com.xys.mb.entities.User;
import com.xys.mb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    UserService userService;
    @RequestMapping(method= RequestMethod.POST, path="/login")
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("password") String password){
        User loginUser = userService.login(userName, password);
        if (loginUser == null){
            return "login failed";
        }else {
            return "login success";
        }
    }
}
