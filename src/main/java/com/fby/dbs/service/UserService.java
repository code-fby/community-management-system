package com.fby.dbs.service;

import com.fby.dbs.model.entity.User;

import java.util.List;

public interface UserService {


    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAllUsers();
}
