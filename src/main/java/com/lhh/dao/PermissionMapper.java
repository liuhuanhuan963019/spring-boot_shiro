package com.lhh.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2021/6/3 22:36
 */
@Mapper
@Repository
public interface PermissionMapper {
    List<String> findByRoleId(@Param("roleIds") List<Integer> roleIds);
}
