package com.fby.dbs.service;

import com.fby.dbs.model.entity.Student;
import com.fby.dbs.model.ResultDto;

public interface StudentService {
    ResultDto selectStudentByStudentNum(Student student);

    ResultDto login(Student student);

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}



