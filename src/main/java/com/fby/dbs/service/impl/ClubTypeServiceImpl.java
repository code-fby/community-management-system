package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.ClubTypeMapper;
import com.fby.dbs.model.entity.ClubType;
import com.fby.dbs.service.ClubTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ClubTypeServiceImpl implements ClubTypeService {

    @Resource
    private ClubTypeMapper clubTypeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return clubTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ClubType record) {
        return clubTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(ClubType record) {
        return clubTypeMapper.insertSelective(record);
    }

    @Override
    public ClubType selectByPrimaryKey(Integer id) {
        return clubTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ClubType record) {
        return clubTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ClubType record) {
        return clubTypeMapper.updateByPrimaryKey(record);
    }

}


