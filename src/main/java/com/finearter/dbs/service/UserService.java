package com.finearter.dbs.service;

import com.finearter.dbs.domain.User;

import java.util.List;

public interface UserService {


    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAllUsers();
}
