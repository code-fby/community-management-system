package com.fby.dbs.mapper;

import com.fby.dbs.model.entity.Activity;

import java.util.ArrayList;

public interface ActivityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);

    ArrayList<Activity> selectByAnyCondition(Activity activity);
}