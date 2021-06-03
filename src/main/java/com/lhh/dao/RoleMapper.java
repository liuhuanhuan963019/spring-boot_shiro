package com.lhh.dao;

import com.lhh.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2021/6/3 22:38
 */
@Mapper
@Repository
public interface RoleMapper {

    List<Role> findRoleByUserId(@Param("userId") Integer userId);
}
