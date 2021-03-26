package com.wanmo.mybatisplus.controller;

import com.wanmo.mybatisplus.common.result.Result;
import com.wanmo.mybatisplus.entity.User;
import com.wanmo.mybatisplus.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Api(tags = "用户管理模块")
@RestController
@RequestMapping("admin/user")
public class UserController {


    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取单个用户信息")
    @GetMapping("get/{id}")
    public Result get(@PathVariable Long id) {
        User user = userService.getById(id);
        return Result.ok(user);
    }

    @ApiOperation(value = "获取所有用户信息")
    @GetMapping("list")
    public Result list() {
        List<User> list = userService.list();
        return Result.ok(list);
    }
}
