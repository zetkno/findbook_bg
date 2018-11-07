package com.zetkno.findbook.controller;

import com.zetkno.findbook.pojo.Book;
import com.zetkno.findbook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/bookList")
    public List<Book> getAllBook() {

        return bookService.getAllBook();
    }
}
