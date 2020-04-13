package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.StudentActivityMappingtableMapper;
import com.fby.dbs.model.entity.StudentActivityMappingtable;
import com.fby.dbs.service.StudentActivityMappingtableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentActivityMappingtableServiceImpl implements StudentActivityMappingtableService {

    @Resource
    private StudentActivityMappingtableMapper studentActivityMappingtableMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return studentActivityMappingtableMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(StudentActivityMappingtable record) {
        return studentActivityMappingtableMapper.insert(record);
    }

    @Override
    public int insertSelective(StudentActivityMappingtable record) {
        return studentActivityMappingtableMapper.insertSelective(record);
    }

    @Override
    public StudentActivityMappingtable selectByPrimaryKey(Integer id) {
        return studentActivityMappingtableMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(StudentActivityMappingtable record) {
        return studentActivityMappingtableMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StudentActivityMappingtable record) {
        return studentActivityMappingtableMapper.updateByPrimaryKey(record);
    }

}


