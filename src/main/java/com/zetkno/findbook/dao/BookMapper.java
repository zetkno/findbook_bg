package com.zetkno.findbook.dao;

import com.zetkno.findbook.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    Book selectByPrimaryKey(Integer bookId);

    List<Book> selectAll();

    List<Book> selectAllWithBookType();

    int updateByPrimaryKey(Book record);
}