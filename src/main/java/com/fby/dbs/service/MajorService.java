package com.fby.dbs.service;

import com.fby.dbs.model.entity.Major;

public interface MajorService {


    int deleteByPrimaryKey(Integer id);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);

}


