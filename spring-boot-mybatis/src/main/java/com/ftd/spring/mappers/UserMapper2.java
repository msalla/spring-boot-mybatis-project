package com.ftd.spring.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.ftd.spring.vo.User;

public interface UserMapper2
{
    @Insert("insert into users(name,email) values(#{name},#{email})")
	void insertUser(User user);
    
    @Select("select * from users where id= {#id}")
    User findUserById(Integer id);
    
    
    List<User> findAllUsers();
}
