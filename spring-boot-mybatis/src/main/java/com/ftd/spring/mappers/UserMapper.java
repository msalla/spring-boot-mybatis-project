package com.ftd.spring.mappers;

import java.util.List;

import com.ftd.spring.vo.User;

public interface UserMapper
{
    void insertUser(User user);
    User findUserById(Integer id);
    List<User> findAllUsers();
}
