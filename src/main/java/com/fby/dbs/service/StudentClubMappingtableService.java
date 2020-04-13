package com.fby.dbs.service;

import com.fby.dbs.model.entity.StudentClubMappingtable;

public interface StudentClubMappingtableService {


    int deleteByPrimaryKey(Integer id);

    int insert(StudentClubMappingtable record);

    int insertSelective(StudentClubMappingtable record);

    StudentClubMappingtable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentClubMappingtable record);

    int updateByPrimaryKey(StudentClubMappingtable record);

}


