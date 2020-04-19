package com.fby.dbs.mapper;

import com.fby.dbs.model.entity.StudentClubMappingtable;

import java.util.ArrayList;

public interface StudentClubMappingtableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentClubMappingtable record);

    int insertSelective(StudentClubMappingtable record);

    StudentClubMappingtable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentClubMappingtable record);

    int updateByPrimaryKey(StudentClubMappingtable record);

    ArrayList<StudentClubMappingtable> selectByAnyCondition(StudentClubMappingtable studentClubMappingtable);

}