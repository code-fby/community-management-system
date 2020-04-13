package com.fby.dbs.mapper;

import com.fby.dbs.model.entity.Financial;

public interface FinancialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Financial record);

    int insertSelective(Financial record);

    Financial selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Financial record);

    int updateByPrimaryKey(Financial record);
}