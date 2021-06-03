package com.lhh.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2021/6/3 22:36
 */
@Data
@ToString
public class Role implements Serializable {

    private static final long serialVersionUID = -1767327914553823741L;

    private Integer id;

    private String role;

    private String desc;
}
