package com.xys.mb.controllers;

import com.xys.mb.entities.User;
import com.xys.mb.services.UserService;
import com.xys.mb.vo.LoginVO;
import com.xys.mb.vo.RegisterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    UserService userService;
    @RequestMapping(method= RequestMethod.POST, path="/login")
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("password") String password){
        return "";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/register")
    public String register(@RequestParam("userName") String userName,
                           @RequestParam("password") String password,
                           @RequestParam("email") String email){
        RegisterVO registerResult = userService.register(userName, password, email);
        return registerResult.getResult() + "-------" + registerResult.getMessage();
    }
}
