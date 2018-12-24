package com.example.user.service;

import com.example.user.dao.UserDao;
import com.example.user.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User queryUserById(long userId) {
        return userDao.queryUserById(userId);
    }
}
