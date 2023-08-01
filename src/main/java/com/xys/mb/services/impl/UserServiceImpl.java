package com.xys.mb.services.impl;

import com.xys.mb.daos.UserDao;
import com.xys.mb.entities.User;
import com.xys.mb.services.UserService;
import com.xys.mb.utils.Constants;
import com.xys.mb.vo.LoginVO;
import com.xys.mb.vo.RegisterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

import static com.xys.mb.utils.Constants.*;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao dao;

    @Override
    public LoginVO login(String userName, String password) {
        User loginUser = dao.selectByUserName(userName);
        if (loginUser == null || !Objects.equals(loginUser.getPassword(), password)){
            return null;
        }else{
            return new LoginVO();
        }
    }

    @Override
    public RegisterVO register(String userName, String password, String email) {
        RegisterVO result = new RegisterVO();
        // check if the username has been used
        User existingUser = dao.selectByUserName(userName);
        if (existingUser != null) {
            result.setResult(FAILURE);
            result.setMessage(SYSTEM_LOGIC_ERROR_MESSAGE);
            result.setUser(existingUser);
            return result;
        }

        User newUser = new User();
        newUser.setUserName(userName);
        newUser.setPassword(password);
        newUser.setEmail(email);

        int insertRowNum = dao.insertUser(new User());
        if (insertRowNum == 0){
            result.setResult(FAILURE);
            result.setMessage(REGISTER_USER_NAME_DUPLICATED_MESSAGE);
        }else {
            result.setResult(SUCCESS);
            result.setMessage(REGISTER_SUCCESS_MESSAGE);
        }
        result.setUser(newUser);

        return result;
    }
}
