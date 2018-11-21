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

    public List<Book> getAllBook() {
        List<Book> list = bookMapper.selectAll();
        for (Book book : list) {
            System.out.println(book.getAuthor());
        }
        return list;

    }


}