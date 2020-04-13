package com.fby.dbs.service;

import com.fby.dbs.model.entity.StudentPositionMappingtable;

public interface StudentPositionMappingtableService {


    int deleteByPrimaryKey(Integer id);

    int insert(StudentPositionMappingtable record);

    int insertSelective(StudentPositionMappingtable record);

    StudentPositionMappingtable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentPositionMappingtable record);

    int updateByPrimaryKey(StudentPositionMappingtable record);

}


