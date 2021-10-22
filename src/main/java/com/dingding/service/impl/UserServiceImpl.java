package com.dingding.service.impl;
import com.dingding.entity.User;
import com.dingding.mapper.UserMapper;
import com.dingding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xpwu on 2019/6/28.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public void addUserInfo(){
        String username = "jack";
        String password = "1test23";
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        userMapper.addUserInfo(user);
    }
}

