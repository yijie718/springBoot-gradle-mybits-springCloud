package com.example.user.controller;

import com.example.user.dto.User;
import com.example.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/{userId}")
    @ResponseBody
    public User queryUserById(@PathVariable("userId") long userId) {
        log.info("queryUserById userId:" + userId);
        return userService.queryUserById(userId);
    }
}
