package com.fby.dbs.mapper;


import com.fby.dbs.model.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lwx
 */
@Repository
public interface UserMapper {



    List<User> selectAllUsers();
}
