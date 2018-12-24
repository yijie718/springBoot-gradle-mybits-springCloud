package com.example.web.api;

import com.example.web.client.UserClient;
import com.example.web.responsebean.ResponseCodeMsg;
import com.example.web.responsebean.ResponseData;
import com.example.web.responsebean.UserResponse;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class UserApi {
    @Autowired
    UserClient userClient;

    @RequestMapping("/users/{userId}")
    @ResponseBody
    public ResponseData queryUserById(@PathVariable("userId") long userId) {
        UserResponse userResponse = userClient.queryUserById(userId);
        Map<String, Object> responseDataMap = Maps.newHashMap();
        responseDataMap.put("user", userResponse);
        return ResponseData.builder()
                .code(ResponseCodeMsg.SUCC_CODE)
                .msg(ResponseCodeMsg.SUCC_MSG)
                .data(responseDataMap)
                .build();
    }
}
