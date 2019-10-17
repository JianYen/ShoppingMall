package com.shoppingmall.shoppingmall.entity;

import javax.persistence.Column;

public class User {

    @Column(name = "id")
    private int id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "real_name")
    private String realName;

    @Column(name = "head_icon")
    private byte[] headIcon;

}
