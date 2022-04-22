package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author LOVE
 * @create 2020/10/21 22:12
 */

@RestController
@Api(tags = "用户模块")
public class UserController {
    @Resource
    private UserService userService;

    @ApiOperation(value = "主页显示接口",notes = "接口说明")
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){

        System.out.println("显示");
        return "index";
    }

    @RequestMapping(value = "/queryAllUser",method = RequestMethod.GET)
    @ApiOperation(value = "用户查询接口",notes = "接口说明")
    public List<User> queryAllUser(){
        System.out.println("查询");
        List<User> users = userService.queryAllUser();
        return users;
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public List<User> loging(){
        System.out.println("查询");
        List<User> users = userService.queryAllUser();
        return users;
    }
}
