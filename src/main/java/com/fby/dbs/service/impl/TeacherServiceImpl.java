package com.fby.dbs.service.impl;

import com.fby.dbs.constants.RoleConstants;
import com.fby.dbs.mapper.CollegeMapper;
import com.fby.dbs.mapper.RoleMapper;
import com.fby.dbs.mapper.TeacherMapper;
import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.College;
import com.fby.dbs.model.entity.Role;
import com.fby.dbs.model.entity.Teacher;
import com.fby.dbs.model.vo.TeacherVo;
import com.fby.dbs.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author fby
 */
@Slf4j
@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private CollegeMapper collegeMapper;

    @Override
    public ResultDto selectAllTeachers() {
        List<Teacher> teachers = teacherMapper.selectAllTeachers();
        ResultDto resultDto = new ResultDto();
        resultDto.setData(teachers);
        return resultDto;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacherMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Teacher record) {
        return teacherMapper.insert(record);
    }

    @Override
    public ResultDto insertSelective(Teacher record) {
        record.setTeacherRoleId(RoleConstants.SUPER_ADMIN);
        Date date=new Date();
        record.setTeacherRegisterDate(date);
        int i = teacherMapper.insertSelective(record);
        ResultDto resultDto=new ResultDto();
        resultDto.setData(i);
        return resultDto;
    }

    @Override
    public Teacher selectByPrimaryKey(Integer id) {
        return teacherMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Teacher record) {
        return teacherMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Teacher record) {
        return teacherMapper.updateByPrimaryKey(record);
    }

    @Override
    public ResultDto login(String teacherNum, String password) {
        Teacher teacher=new Teacher();
        teacher.setTeacherNum(teacherNum);
        teacher.setTeacherPassword(password);
        ResultDto resultDto=new ResultDto();

        ArrayList<Teacher> teachers=teacherMapper.selectByAnyCondition(teacher);
        if(teachers.size()==0){
            resultDto.setMessage("操作成功，但是密码错误");
        }else {

            Teacher t = teachers.get(0);
            TeacherVo teacherVo=teacherCovertTeacherVo(t);


            resultDto.setData(teacherVo);
        }
        return resultDto;
    }

    private TeacherVo teacherCovertTeacherVo(Teacher t) {

        TeacherVo teacherVo=new TeacherVo();

        Role role = roleMapper.selectByPrimaryKey(t.getTeacherRoleId());
        College college = collegeMapper.selectByPrimaryKey(t.getTeacherCollegeId());
        teacherVo.setId(t.getId());
        teacherVo.setTeacherName(t.getTeacherName());
        teacherVo.setTeacherNum(t.getTeacherNum());
        teacherVo.setTeacherPassword(t.getTeacherPassword());
        teacherVo.setTeacherPhone(t.getTeacherPhone());
        teacherVo.setTeacherRegisterDate(t.getTeacherRegisterDate());
        teacherVo.setTeacherSex(t.getTeacherSex());

        teacherVo.setRole(role);
        teacherVo.setCollege(college);
        return teacherVo;
    }

    @Override
    public ResultDto info(String teacherNum) {
        ResultDto resultDto=new ResultDto();
        Teacher teacher=new Teacher();
        teacher.setTeacherNum(teacherNum);
        ArrayList<Teacher> teachers = teacherMapper.selectByAnyCondition(teacher);
        if(teachers.size()!=0){
            Teacher t = teachers.get(0);
            TeacherVo teacherVo=teacherCovertTeacherVo(t);

            resultDto.setData(teacherVo);
        }
        return resultDto;
    }
}



