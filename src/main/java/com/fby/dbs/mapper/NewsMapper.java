package com.fby.dbs.mapper;

import com.fby.dbs.model.entity.News;

import java.util.ArrayList;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    ArrayList<News> selectByAnyCondition(News news);

}
