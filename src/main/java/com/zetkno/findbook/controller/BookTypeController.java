package com.zetkno.findbook.controller;

import com.zetkno.findbook.pojo.BookType;
import com.zetkno.findbook.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zetkno on 2018/11/27 0027.
 */
@RestController
public class BookTypeController {

    @Autowired
    BookTypeService bookTypeService;

    @RequestMapping(value = "/typeList")
    public List<BookType> getAllType() {
        return bookTypeService.getAllType();
    }

}
