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
    UserMapper userMapper;

    User user;

    public boolean checkUser(String userName) {
        user = userMapper.selectByUserName(userName);
        if (user == null)
            return false;
        else
            return true;
    }
    public String getPassword(String username) {
        return userMapper.selectByUserName(username).getPassword();
    }


//    @Override
//    public String getPassword(String userName) {
//
//        return userMapper.selectPasswordByUserName(userName);
//    }
}
