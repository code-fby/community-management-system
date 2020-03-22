package com.finearter.dbs.mapper;


import com.finearter.dbs.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lwx
 */
@Repository
public interface UserMapper {



    List<User> selectAllUsers();
}
