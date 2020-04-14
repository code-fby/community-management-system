package com.fby.dbs.service;

import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.Teacher;

public interface TeacherService {
    ResultDto selectAllTeachers();

    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    ResultDto insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    ResultDto login(String teacherNum, String password);

    ResultDto info(String teacherNum);
}



