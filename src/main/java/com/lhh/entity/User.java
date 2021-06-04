package com.lhh.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2021/6/3 22:35
 */
@Data
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = -6056125703075132981L;

    private Integer id;

    private String account;

    private String password;

    private String username="胖胖";
}
