package com.fby.dbs.mapper;

import com.fby.dbs.model.entity.ClubActivityMappingtable;

import java.util.ArrayList;

public interface ClubActivityMappingtableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClubActivityMappingtable record);

    int insertSelective(ClubActivityMappingtable record);

    ClubActivityMappingtable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClubActivityMappingtable record);

    int updateByPrimaryKey(ClubActivityMappingtable record);

    ArrayList<ClubActivityMappingtable> selectByAnyCondition(ClubActivityMappingtable clubActivityMappingtable);
}