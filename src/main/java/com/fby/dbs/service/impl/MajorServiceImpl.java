package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.MajorMapper;
import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.Major;
import com.fby.dbs.service.MajorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class MajorServiceImpl implements MajorService {

    @Resource
    private MajorMapper majorMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return majorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Major record) {
        return majorMapper.insert(record);
    }

    @Override
    public int insertSelective(Major record) {
        return majorMapper.insertSelective(record);
    }

    @Override
    public Major selectByPrimaryKey(Integer id) {
        return majorMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Major record) {
        return majorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Major record) {
        return majorMapper.updateByPrimaryKey(record);
    }

    @Override
    public ResultDto selectAll() {
        ArrayList<Major> arrayList = majorMapper.selectByAnyCondition(new Major());
        ResultDto resultDto = new ResultDto();
        resultDto.setData(arrayList);
        return resultDto;
    }
}


