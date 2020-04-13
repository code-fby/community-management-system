package com.fby.dbs.service;

import com.fby.dbs.model.entity.College;

public interface CollegeService {


    int deleteByPrimaryKey(Integer id);

    int insert(College record);

    int insertSelective(College record);

    College selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(College record);

    int updateByPrimaryKey(College record);

}


