package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.ActivityMapper;
import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.Activity;
import com.fby.dbs.service.ActivityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Resource
    private ActivityMapper activityMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return activityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Activity record) {
        return activityMapper.insert(record);
    }

    @Override
    public int insertSelective(Activity record) {
        return activityMapper.insertSelective(record);
    }

    @Override
    public Activity selectByPrimaryKey(Integer id) {
        return activityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Activity record) {
        return activityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Activity record) {
        return activityMapper.updateByPrimaryKey(record);
    }

    @Override
    public ResultDto selectAll(Integer pageIndex,Integer pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        ArrayList<Activity> arrayList = activityMapper.selectByAnyCondition(new Activity());
        PageInfo pageInfo=new PageInfo(arrayList);
        ResultDto resultDto = new ResultDto();
        resultDto.setData(pageInfo);
        return resultDto;
    }

    @Override
    public ResultDto selectTotalCount() {
        Integer count=activityMapper.selectTotalCount();
        ResultDto resultDto=new ResultDto();
        resultDto.setData(count);
        return resultDto;
    }

    @Override
    public ResultDto selectTop10() {
        ArrayList<Activity> activities=activityMapper.selectTop10();
        return null;
    }

}


