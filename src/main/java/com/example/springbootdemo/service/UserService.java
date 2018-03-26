package com.example.springbootdemo.service;

import com.example.springbootdemo.dao.UserMapper;
import com.example.springbootdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;

    public void addUser(User user){
        userMapper.insert(user);
    }

    public List<User> selectList() {
        return userMapper.selectAll();
    }
}
