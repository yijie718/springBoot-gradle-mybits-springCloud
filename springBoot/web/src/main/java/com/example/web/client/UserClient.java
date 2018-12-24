package com.example.web.client;

import com.example.web.responsebean.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("${service.user.name:user}")
@Component
public interface UserClient {

    @GetMapping("/users/{userId}")
    UserResponse queryUserById(long userId);
}
