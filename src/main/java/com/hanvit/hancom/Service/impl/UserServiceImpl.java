package com.hanvit.hancom.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hanvit.hancom.Dao.UserMapper;
import com.hanvit.hancom.Dto.User;
import com.hanvit.hancom.Service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public Integer insertUserTime(User input) {
        return userMapper.insertUserTime(input);
    }
    
}
