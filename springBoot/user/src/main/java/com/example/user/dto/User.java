package com.example.user.dto;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

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
