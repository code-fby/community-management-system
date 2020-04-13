package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.ClubMapper;
import com.fby.dbs.model.entity.Club;
import com.fby.dbs.service.ClubService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ClubServiceImpl implements ClubService {

    @Resource
    private ClubMapper clubMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return clubMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Club record) {
        return clubMapper.insert(record);
    }

    @Override
    public int insertSelective(Club record) {
        return clubMapper.insertSelective(record);
    }

    @Override
    public Club selectByPrimaryKey(Integer id) {
        return clubMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Club record) {
        return clubMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Club record) {
        return clubMapper.updateByPrimaryKey(record);
    }

}


