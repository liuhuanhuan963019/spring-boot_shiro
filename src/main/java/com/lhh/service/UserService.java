package com.lhh.service;

import com.lhh.entity.User;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2021/6/3 22:42
 */
public interface UserService {
    User findByAccount(String account);
}
