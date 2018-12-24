package com.example.web.responsebean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResponse {
    /**
     * 用户主键ID
     */
    private long id;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 性别
     */
    private String sex;
}
