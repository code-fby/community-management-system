package com.fby.dbs.mapper;

import com.fby.dbs.model.entity.StudentActivityMappingtable;

public interface StudentActivityMappingtableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentActivityMappingtable record);

    int insertSelective(StudentActivityMappingtable record);

    StudentActivityMappingtable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentActivityMappingtable record);

    int updateByPrimaryKey(StudentActivityMappingtable record);
}