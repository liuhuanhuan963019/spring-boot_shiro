package com.lhh.dao;

import com.lhh.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2021/6/3 22:39
 */
@Mapper
@Repository
public interface UserMapper {
    User findByAccount(@Param("account") String account);
}
