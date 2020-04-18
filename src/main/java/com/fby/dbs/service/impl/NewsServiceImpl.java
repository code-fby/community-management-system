package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.NewsMapper;
import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.News;
import com.fby.dbs.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class NewsServiceImpl implements NewsService {

    @Resource
    private NewsMapper newsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return newsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(News record) {
        return newsMapper.insert(record);
    }

    @Override
    public int insertSelective(News record) {
        return newsMapper.insertSelective(record);
    }

    @Override
    public News selectByPrimaryKey(Integer id) {
        return newsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(News record) {
        return newsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(News record) {
        return newsMapper.updateByPrimaryKey(record);
    }

    public ResultDto selectAll() {
        ArrayList<News> arrayList = newsMapper.selectByAnyCondition(new News());
        ResultDto resultDto = new ResultDto();
        resultDto.setData(arrayList);
        return resultDto;
    }

}


