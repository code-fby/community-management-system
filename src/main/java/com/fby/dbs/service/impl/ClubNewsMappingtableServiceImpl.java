package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.ClubNewsMappingtableMapper;
import com.fby.dbs.model.entity.ClubNewsMappingtable;
import com.fby.dbs.service.ClubNewsMappingtableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ClubNewsMappingtableServiceImpl implements ClubNewsMappingtableService {

    @Resource
    private ClubNewsMappingtableMapper clubNewsMappingtableMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return clubNewsMappingtableMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ClubNewsMappingtable record) {
        return clubNewsMappingtableMapper.insert(record);
    }

    @Override
    public int insertSelective(ClubNewsMappingtable record) {
        return clubNewsMappingtableMapper.insertSelective(record);
    }

    @Override
    public ClubNewsMappingtable selectByPrimaryKey(Integer id) {
        return clubNewsMappingtableMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ClubNewsMappingtable record) {
        return clubNewsMappingtableMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ClubNewsMappingtable record) {
        return clubNewsMappingtableMapper.updateByPrimaryKey(record);
    }

}


