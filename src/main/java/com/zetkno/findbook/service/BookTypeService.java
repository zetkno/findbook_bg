package com.zetkno.findbook.service;

import com.zetkno.findbook.dao.BookTypeMapper;
import com.zetkno.findbook.pojo.BookType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zetkno on 2018/11/27 0027.
 */
@Service
public class BookTypeService {

    @Autowired
    BookTypeMapper bookTypeMapper;

    public List<BookType> getAllType() {
        return bookTypeMapper.selectAll();
    }

}
