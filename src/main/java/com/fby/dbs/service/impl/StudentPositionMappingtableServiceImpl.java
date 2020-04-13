package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.StudentPositionMappingtableMapper;
import com.fby.dbs.model.entity.StudentPositionMappingtable;
import com.fby.dbs.service.StudentPositionMappingtableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentPositionMappingtableServiceImpl implements StudentPositionMappingtableService {

    @Resource
    private StudentPositionMappingtableMapper studentPositionMappingtableMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return studentPositionMappingtableMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(StudentPositionMappingtable record) {
        return studentPositionMappingtableMapper.insert(record);
    }

    @Override
    public int insertSelective(StudentPositionMappingtable record) {
        return studentPositionMappingtableMapper.insertSelective(record);
    }

    @Override
    public StudentPositionMappingtable selectByPrimaryKey(Integer id) {
        return studentPositionMappingtableMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(StudentPositionMappingtable record) {
        return studentPositionMappingtableMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StudentPositionMappingtable record) {
        return studentPositionMappingtableMapper.updateByPrimaryKey(record);
    }

}


