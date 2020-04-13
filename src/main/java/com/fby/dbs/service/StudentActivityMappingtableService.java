package com.fby.dbs.service;

import com.fby.dbs.model.entity.StudentActivityMappingtable;

public interface StudentActivityMappingtableService {


    int deleteByPrimaryKey(Integer id);

    int insert(StudentActivityMappingtable record);

    int insertSelective(StudentActivityMappingtable record);

    StudentActivityMappingtable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentActivityMappingtable record);

    int updateByPrimaryKey(StudentActivityMappingtable record);

}


