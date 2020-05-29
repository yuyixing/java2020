package com.yuyx.demo.mapper;

import com.yuyx.demo.bean.UserBean;

public interface UserMapper {
    UserBean getInfo(String username, String password);
}
