package com.lhh.service;

import java.util.List;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2021/6/3 22:42
 */
public interface PermissionService {
    List<String> findByRoleId(List<Integer> roleIds);
}
