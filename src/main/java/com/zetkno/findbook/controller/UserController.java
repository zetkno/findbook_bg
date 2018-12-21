package com.zetkno.findbook.controller;

import com.zetkno.findbook.pojo.User;
import com.zetkno.findbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zetkno on 2018/12/11 0011.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userList")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }


}
