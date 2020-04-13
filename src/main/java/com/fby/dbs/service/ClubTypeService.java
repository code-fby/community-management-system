package com.fby.dbs.service;

import com.fby.dbs.model.entity.ClubType;

public interface ClubTypeService {


    int deleteByPrimaryKey(Integer id);

    int insert(ClubType record);

    int insertSelective(ClubType record);

    ClubType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClubType record);

    int updateByPrimaryKey(ClubType record);

}


