package com.xys.mb.services;

import com.xys.mb.daos.UserDao;
import com.xys.mb.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User login(String userName, String password);

}
