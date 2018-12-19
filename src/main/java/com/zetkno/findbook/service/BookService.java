package com.zetkno.findbook.service;

import com.zetkno.findbook.dao.BookMapper;
import com.zetkno.findbook.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    public List<Book> getAllBookWithType() {
        List<Book> list = bookMapper.selectAllWithBookType();
        return list;

    }


}