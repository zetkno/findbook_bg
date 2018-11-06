package com.zetkno.findbook.controller;

import com.zetkno.findbook.utils.CodeUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zetkno on 2018/11/3 0003.
 */
@RestController
public class TestContorller {

    @RequestMapping(value= "/test")
    public String test() {
        return "test success";
    }
}
