package com.fby.dbs.service;

import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.News;

public interface NewsService {


    int deleteByPrimaryKey(Integer id);

    int insert(News record);

    int insertSelective(News record);

    ResultDto selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    ResultDto selectAll(Integer pageIndex,Integer pageSize);

    ResultDto selectTop5();

    ResultDto selectTotalCount();

}


