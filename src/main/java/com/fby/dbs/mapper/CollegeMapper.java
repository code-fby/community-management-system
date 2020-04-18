package com.fby.dbs.mapper;

import com.fby.dbs.model.entity.College;

import java.util.ArrayList;

public interface CollegeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(College record);

    int insertSelective(College record);

    College selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(College record);

    int updateByPrimaryKey(College record);

    ArrayList<College> selectByAnyCondition(College college);

}
