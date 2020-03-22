package com.finearter.dbs.service.impl;

import com.finearter.dbs.domain.User;
import com.finearter.dbs.mapper.UserMapper;
import com.finearter.dbs.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @author lwx
 */
@Slf4j
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;



    /**
     * 查询所有用户
     *
     * @return
     */
    @Override
    public List<User> selectAllUsers() {
        log.info("userService...");
        return userMapper.selectAllUsers();
    }
}
