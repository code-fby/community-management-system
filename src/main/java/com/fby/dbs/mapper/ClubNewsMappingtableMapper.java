package com.fby.dbs.mapper;

import com.fby.dbs.model.entity.ClubNewsMappingtable;

public interface ClubNewsMappingtableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClubNewsMappingtable record);

    int insertSelective(ClubNewsMappingtable record);

    ClubNewsMappingtable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClubNewsMappingtable record);

    int updateByPrimaryKey(ClubNewsMappingtable record);
}