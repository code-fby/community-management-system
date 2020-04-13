package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.ClubActivityMappingtableMapper;
import com.fby.dbs.model.entity.ClubActivityMappingtable;
import com.fby.dbs.service.ClubActivityMappingtableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ClubActivityMappingtableServiceImpl implements ClubActivityMappingtableService {

    @Resource
    private ClubActivityMappingtableMapper clubActivityMappingtableMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return clubActivityMappingtableMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ClubActivityMappingtable record) {
        return clubActivityMappingtableMapper.insert(record);
    }

    @Override
    public int insertSelective(ClubActivityMappingtable record) {
        return clubActivityMappingtableMapper.insertSelective(record);
    }

    @Override
    public ClubActivityMappingtable selectByPrimaryKey(Integer id) {
        return clubActivityMappingtableMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ClubActivityMappingtable record) {
        return clubActivityMappingtableMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ClubActivityMappingtable record) {
        return clubActivityMappingtableMapper.updateByPrimaryKey(record);
    }

}


