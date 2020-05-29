package com.yuyx.demo;

import com.yuyx.demo.bean.UserBean;
import com.yuyx.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        UserBean userBean = userService.loginIn("a","b");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

}
