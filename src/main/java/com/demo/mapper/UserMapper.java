package com.demo.mapper;

import com.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author LOVE
 * @create 2020/10/21 22:11
 */
@Repository
public interface UserMapper {
    int addUser(User user);

    int deleteUserById(long id);

    int updateUser(User user);

    User queryById(long id);

    List<User> queryAllUser();
}
