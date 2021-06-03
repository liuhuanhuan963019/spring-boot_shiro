package com.lhh.service.impl;

import com.lhh.dao.UserMapper;
import com.lhh.entity.User;
import com.lhh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2021/6/3 22:41
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByAccount(String account) {
        return userMapper.findByAccount(account);
    }
}
