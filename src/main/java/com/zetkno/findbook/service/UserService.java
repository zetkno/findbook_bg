package com.zetkno.findbook.service;

import com.zetkno.findbook.dao.UserMapper;
import com.zetkno.findbook.pojo.User;
import com.zetkno.findbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    User user;

    public boolean checkUser(String userName) {
        user = userMapper.selectByUserName(userName);
        System.out.println("数据内的用户名：" + user.getUserName());
        if (user == null)
            return false;
        else
            return true;
    }

    public User getUserByUsername(String username) {

        return userMapper.selectByUserName(username);
    }

    public List<User> getAllUser() {
        return userMapper.selectAll();
    }
}
