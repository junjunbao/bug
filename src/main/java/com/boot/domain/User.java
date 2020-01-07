package com.boot.domain;

import lombok.Data;

/**
 * @author dongbenqiang
 * @// FIXME: 2019/6/26
 */
@Data
public class User {
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userEmail;
}
