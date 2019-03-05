package com.example.mapper;


import com.example.domain.User;

public interface UserMapper {
    /**
     * 新增用户
     * @param user
     */
    void insert(User user);
}
