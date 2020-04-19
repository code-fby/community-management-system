package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.ClubMapper;
import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.Club;
import com.fby.dbs.service.ClubService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

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
    public ResultDto selectByPrimaryKey(Integer id) {
        Club club = clubMapper.selectByPrimaryKey(id);
        ResultDto resultDto=new ResultDto();
        resultDto.setData(club);
        return resultDto;
    }

    @Override
    public int updateByPrimaryKeySelective(Club record) {
        return clubMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Club record) {
        return clubMapper.updateByPrimaryKey(record);
    }



    @Override
    public ResultDto selectAll(Integer pageIndex,Integer pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        ArrayList<Club> arrayList = clubMapper.selectByAnyCondition(new Club());
        PageInfo pageInfo=new PageInfo(arrayList);
        ResultDto resultDto = new ResultDto();
        resultDto.setData(pageInfo
        );
        return resultDto;
    }

    @Override
    public ResultDto selectByName(String clubName,Integer pageIndex,Integer pageSize) {
        Club club=new Club();
        club.setClubName(clubName);
        PageHelper.startPage(pageIndex,pageSize);
        ArrayList<Club> clubs = clubMapper.selectByAnyCondition(club);
        PageInfo pageInfo=new PageInfo(clubs);

        ResultDto resultDto=new ResultDto();
        resultDto.setData(pageInfo);
        return resultDto;


    }

    @Override
    public ResultDto selectTotalCount() {
        Integer count=clubMapper.selectTotalCount();
        ResultDto resultDto=new ResultDto();
        resultDto.setData(count);
        return resultDto;
    }

}


