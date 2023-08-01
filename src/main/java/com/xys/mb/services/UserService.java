package com.xys.mb.services;

import com.xys.mb.daos.UserDao;
import com.xys.mb.entities.User;
import com.xys.mb.vo.LoginVO;
import com.xys.mb.vo.RegisterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    LoginVO login(String userName, String password);

    RegisterVO register(String userName, String password, String email);
}
