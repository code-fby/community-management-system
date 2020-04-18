package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.NewsMapper;
import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.News;
import com.fby.dbs.service.NewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public ResultDto selectByPrimaryKey(Integer id) {
        News news = newsMapper.selectByPrimaryKey(id);
        ResultDto resultDto=new ResultDto();
        resultDto.setData(news);
        return resultDto;
    }

    @Override
    public int updateByPrimaryKeySelective(News record) {
        return newsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(News record) {
        return newsMapper.updateByPrimaryKey(record);
    }

    @Override
    public ResultDto selectAll(Integer pageIndex, Integer pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        ArrayList<News> arrayList = newsMapper.selectByAnyCondition(new News());

        PageInfo pageInfo=new PageInfo(arrayList);
        ResultDto resultDto = new ResultDto();
        resultDto.setData(pageInfo);
        return resultDto;
    }

    @Override
    public ResultDto selectTop5() {
        ArrayList<News> news=newsMapper.selectTop10();
        ResultDto resultDto=new ResultDto();
        resultDto.setData(news);
        return resultDto;
    }

    @Override
    public ResultDto selectTotalCount() {
        Integer count=newsMapper.selectTotalCount();
        return null;
    }

}


