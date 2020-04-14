package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.ActivityMapper;
import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.Activity;
import com.fby.dbs.service.ActivityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    public ResultDto selectAll() {
        ArrayList<Activity> arrayList = activityMapper.selectByAnyCondition(new Activity());
        ResultDto resultDto = new ResultDto();
        resultDto.setData(arrayList);
        return resultDto;
    }

}


