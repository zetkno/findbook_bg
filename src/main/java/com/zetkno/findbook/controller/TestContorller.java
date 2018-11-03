package com.zetkno.findbook.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zetkno on 2018/11/3 0003.
 */
@RequestMapping("/test")
public class TestContorller {

    public static void main(String[] args) {

    }
    public String test() {
        return "test success";
    }
}
