package com.demo.service;

import com.demo.entity.User;

import java.util.List;

/**
 * @Author LOVE
 * @create 2020/10/21 22:10
 */
public interface UserService {
    int addUser(User user);

    int deleteUserById(long id);

    int updateUser(User user);

    User queryById(long id);

    List<User> queryAllUser();
}
