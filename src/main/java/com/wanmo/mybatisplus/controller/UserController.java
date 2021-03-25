package com.wanmo.mybatisplus.controller;

import com.wanmo.mybatisplus.entity.User;
import com.wanmo.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("get/{id}")
    public User get(@PathVariable Long id) {
        User user = userService.getById(id);
        System.out.println(user);
        return user;
    }

    @RequestMapping("list")
    public List<User> list() {
        List<User> list = userService.list();
        System.out.println(list);
        return list;
    }
}
