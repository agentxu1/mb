package com.xys.mb.daos;

import com.xys.mb.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;

@Mapper
public interface UserDao {
    User selectByUserId(Long id);
    User selectByUserName(String userName);
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(User user);

}
