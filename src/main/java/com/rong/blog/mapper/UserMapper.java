package com.rong.blog.mapper;

import com.rong.blog.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public User login(String account);
}
