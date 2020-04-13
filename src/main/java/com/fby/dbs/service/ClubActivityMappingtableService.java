package com.fby.dbs.service;

import com.fby.dbs.model.entity.ClubActivityMappingtable;

public interface ClubActivityMappingtableService {


    int deleteByPrimaryKey(Integer id);

    int insert(ClubActivityMappingtable record);

    int insertSelective(ClubActivityMappingtable record);

    ClubActivityMappingtable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClubActivityMappingtable record);

    int updateByPrimaryKey(ClubActivityMappingtable record);

}


