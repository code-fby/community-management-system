package com.fby.dbs.service;

import com.fby.dbs.model.entity.Position;

public interface PositionService {


    int deleteByPrimaryKey(Integer id);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);

}


