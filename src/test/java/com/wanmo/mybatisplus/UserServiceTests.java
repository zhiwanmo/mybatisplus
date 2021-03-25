package com.wanmo.mybatisplus;

import com.wanmo.mybatisplus.entity.User;
import com.wanmo.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


class UserServiceTests extends MybatisplusApplicationTests {

    @Autowired
    UserService userService;

    /**
     * 测试获取单个
     */
    @Test
    void getByIdTest() {
        User user = userService.getById(1374606009118756865L);
        System.out.println(user);
    }

    /**
     * 查询全部测试
     */
    @Test
    void listTest() {
        List<User> list = userService.list();
        System.out.println(list);
    }

}
