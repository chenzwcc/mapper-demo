package com.code.mapperdemo.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data //lombok注解
public class UserInfo {

    @Id //通用mapper中的注解，表示主键
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY) //通用mapper中的注解，表示自增
    private String id;
    @Column
    private String loginName;
    @Column
    private String nickName;
    @Column
    private String passwd;
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;
    @Column
    private String headImg;
    @Column
    private String userLevel;

}
