package com.fby.dbs.mapper;

import com.fby.dbs.model.entity.Major;

import java.util.ArrayList;

public interface MajorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);

    ArrayList<Major> selectByAnyCondition(Major major);

}
