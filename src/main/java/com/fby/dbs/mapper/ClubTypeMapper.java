package com.fby.dbs.mapper;

import com.fby.dbs.model.entity.ClubType;

public interface ClubTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClubType record);

    int insertSelective(ClubType record);

    ClubType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClubType record);

    int updateByPrimaryKey(ClubType record);
}