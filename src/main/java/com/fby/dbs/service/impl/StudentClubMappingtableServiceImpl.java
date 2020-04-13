package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.StudentClubMappingtableMapper;
import com.fby.dbs.model.entity.StudentClubMappingtable;
import com.fby.dbs.service.StudentClubMappingtableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentClubMappingtableServiceImpl implements StudentClubMappingtableService {

    @Resource
    private StudentClubMappingtableMapper studentClubMappingtableMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return studentClubMappingtableMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(StudentClubMappingtable record) {
        return studentClubMappingtableMapper.insert(record);
    }

    @Override
    public int insertSelective(StudentClubMappingtable record) {
        return studentClubMappingtableMapper.insertSelective(record);
    }

    @Override
    public StudentClubMappingtable selectByPrimaryKey(Integer id) {
        return studentClubMappingtableMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(StudentClubMappingtable record) {
        return studentClubMappingtableMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StudentClubMappingtable record) {
        return studentClubMappingtableMapper.updateByPrimaryKey(record);
    }

}


