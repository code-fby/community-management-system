package com.fby.dbs.service;

import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.Activity;

public interface ActivityService {


    int deleteByPrimaryKey(Integer id);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);

    ResultDto selectAll(Integer pageIndex,Integer pageSize);

    ResultDto selectTotalCount();

    ResultDto selectTop10();
}


