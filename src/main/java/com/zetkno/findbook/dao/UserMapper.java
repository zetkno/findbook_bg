package com.zetkno.findbook.dao;

import com.zetkno.findbook.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
//    int deleteByPrimaryKey(Integer userid);

//    int insert(User record);

//    User selectByPrimaryKey(Integer userid);

    List<User> selectAll();
    List<User> selectWithAll();

//    int updateByPrimaryKey(User record);

    User selectByUserName(String nmae);


}