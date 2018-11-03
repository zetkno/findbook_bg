package com.zetkno.findbook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zetkno on 2018/11/3 0003.
 */
@RestController
//@RequestMapping(value= "/test")
public class TestContorller {

    @RequestMapping(value= "/test")
    public String test() {
        return "test success";
    }
}
