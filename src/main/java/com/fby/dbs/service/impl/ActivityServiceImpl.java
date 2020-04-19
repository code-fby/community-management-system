package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.ActivityMapper;
import com.fby.dbs.mapper.ClubActivityMappingtableMapper;
import com.fby.dbs.mapper.ClubMapper;
import com.fby.dbs.mapper.TeacherMapper;
import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.Activity;
import com.fby.dbs.model.entity.Club;
import com.fby.dbs.model.entity.ClubActivityMappingtable;
import com.fby.dbs.model.entity.Teacher;
import com.fby.dbs.model.vo.ActivityVo;
import com.fby.dbs.service.ActivityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Resource
    private ActivityMapper activityMapper;


    @Resource
    private ClubActivityMappingtableMapper clubActivityMappingtableMapper;


    @Resource
    private ClubMapper clubMapper;


    @Resource
    private TeacherMapper teacherMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return activityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Activity record) {
        return activityMapper.insert(record);
    }

    @Override
    public int insertSelective(Activity record) {
        return activityMapper.insertSelective(record);
    }

    @Override
    public ResultDto selectByPrimaryKey(Integer id) {
        Activity activity = activityMapper.selectByPrimaryKey(id);

        ActivityVo activityVo=activityConvertActivityVo(activity);
        ResultDto resultDto=new ResultDto();
        resultDto.setData(activityVo);
        return resultDto;
    }

    private ActivityVo activityConvertActivityVo(Activity activity) {
        ActivityVo activityVo = new ActivityVo();


        //查询条件
        ClubActivityMappingtable clubActivityMappingtable = new ClubActivityMappingtable();
        clubActivityMappingtable.setActivityId(activity.getId());

        ArrayList<ClubActivityMappingtable> activityMappingtables=clubActivityMappingtableMapper.selectByAnyCondition(clubActivityMappingtable);


        ArrayList<Club> clubs=new ArrayList<>();
        for(ClubActivityMappingtable activityMappingtable:activityMappingtables){
            Club club = clubMapper.selectByPrimaryKey(activityMappingtable.getClubId());
            clubs.add(club);
        }

        Teacher teacher = teacherMapper.selectByPrimaryKey(activity.getActivityAuditorId());

        activityVo.setActivityAuditor(teacher);
        activityVo.setClubs(clubs);
        activityVo.setId(activity.getId());
        activityVo.setActivityEndTime(activity.getActivityEndTime());
        activityVo.setActivityGoal(activity.getActivityGoal());
        activityVo.setActivityLaunchTime(activity.getActivityLaunchTime());
        activityVo.setActivityLeader(activity.getActivityLeader());
        activityVo.setActivityLocation(activity.getActivityLocation());
        activityVo.setActivityProfile(activity.getActivityProfile());
        activityVo.setActivityName(activity.getActivityName());
        activityVo.setActivityStartTime(activity.getActivityStartTime());
        activityVo.setActivityStatus(activity.getActivityStatus());

        return activityVo;
    }

    @Override
    public int updateByPrimaryKeySelective(Activity record) {
        return activityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Activity record) {
        return activityMapper.updateByPrimaryKey(record);
    }

    @Override
    public ResultDto selectAll(Integer pageIndex,Integer pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        ArrayList<Activity> arrayList = activityMapper.selectByAnyCondition(new Activity());
        PageInfo pageInfo=new PageInfo(arrayList);
        ResultDto resultDto = new ResultDto();
        resultDto.setData(pageInfo);
        return resultDto;
    }

    @Override
    public ResultDto selectTotalCount() {
        Integer count=activityMapper.selectTotalCount();
        ResultDto resultDto=new ResultDto();
        resultDto.setData(count);
        return resultDto;
    }

    @Override
    public ResultDto selectTop10() {
        ArrayList<Activity> activities=activityMapper.selectTop10();
        ResultDto resultDto=new ResultDto();
        resultDto.setData(activities);
        return resultDto;
    }

}


