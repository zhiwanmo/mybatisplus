package com.wanmo.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanmo.mybatisplus.entity.User;
import com.wanmo.mybatisplus.mapper.UserMapper;
import com.wanmo.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
