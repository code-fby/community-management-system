package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.CollegeMapper;
import com.fby.dbs.model.entity.College;
import com.fby.dbs.service.CollegeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Resource
    private CollegeMapper collegeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return collegeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(College record) {
        return collegeMapper.insert(record);
    }

    @Override
    public int insertSelective(College record) {
        return collegeMapper.insertSelective(record);
    }

    @Override
    public College selectByPrimaryKey(Integer id) {
        return collegeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(College record) {
        return collegeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(College record) {
        return collegeMapper.updateByPrimaryKey(record);
    }

}


