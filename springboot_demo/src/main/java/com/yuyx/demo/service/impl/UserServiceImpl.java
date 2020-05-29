package com.yuyx.demo.service.impl;


import com.yuyx.demo.bean.UserBean;
import com.yuyx.demo.mapper.UserMapper;
import com.yuyx.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public UserBean loginIn(String username, String password) {
        return userMapper.getInfo(username,password);
    }
}
