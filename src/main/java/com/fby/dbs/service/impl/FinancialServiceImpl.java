package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.FinancialMapper;
import com.fby.dbs.model.entity.Financial;
import com.fby.dbs.service.FinancialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FinancialServiceImpl implements FinancialService {

    @Resource
    private FinancialMapper financialMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return financialMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Financial record) {
        return financialMapper.insert(record);
    }

    @Override
    public int insertSelective(Financial record) {
        return financialMapper.insertSelective(record);
    }

    @Override
    public Financial selectByPrimaryKey(Integer id) {
        return financialMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Financial record) {
        return financialMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Financial record) {
        return financialMapper.updateByPrimaryKey(record);
    }

}


