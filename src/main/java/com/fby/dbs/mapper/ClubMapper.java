package com.fby.dbs.mapper;

import com.fby.dbs.model.entity.Club;

import java.util.ArrayList;

public interface ClubMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Club record);

    int insertSelective(Club record);

    Club selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Club record);

    int updateByPrimaryKey(Club record);

    ArrayList<Club> selectByAnyCondition(Club club);
}
