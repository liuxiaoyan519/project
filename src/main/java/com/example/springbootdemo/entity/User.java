package com.example.springbootdemo.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name="user")
@Data
public class User implements Serializable{
    @Id
    private Long userId;
    //名称
    private String userName;
    //密码
    private String password;
    private String phone;
}
