package com.fby.dbs.service;

import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.Teacher;

public interface TeacherService {
    ResultDto selectAllTeachers();

    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}



