package com.fby.dbs.service;

import com.fby.dbs.model.entity.Club;

public interface ClubService {


    int deleteByPrimaryKey(Integer id);

    int insert(Club record);

    int insertSelective(Club record);

    Club selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Club record);

    int updateByPrimaryKey(Club record);

}

