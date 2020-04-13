package com.fby.dbs.controller;


import com.fby.dbs.model.entity.User;
import com.fby.dbs.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fby
 */
@Slf4j
@RestController  //代表 返回的是一个json数据
@RequestMapping("/user")
public class UserController {  //controller 调用 service, service 调用 mapper

    @Autowired
    private UserService userService;


    @GetMapping("/all")
//    @ResponseBody  //代表 返回的是一个json数据
    public List<User> selectAllUsers(){
        log.info("userController...");
        return  userService.selectAllUsers();
    }


}
