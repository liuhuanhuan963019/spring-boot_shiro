package com.lhh.service;

import com.lhh.entity.Role;

import java.util.List;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2021/6/3 22:42
 */
public interface RoleService {
    List<Role> findRoleByUserId(Integer id);
}
