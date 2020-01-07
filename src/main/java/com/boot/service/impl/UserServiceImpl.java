package com.boot.service.impl;

import com.boot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.boot.domain.User;
import com.boot.service.UserService;

/**
 * @author  dongbenqiang
 * @// FIXME: 2019/6/26
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(Integer userId) {
        return userMapper.selectUserById(userId);
    }

}
