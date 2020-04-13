package com.fby.dbs.service.impl;

import com.fby.dbs.mapper.MajorMapper;
import com.fby.dbs.mapper.RoleMapper;
import com.fby.dbs.mapper.StudentMapper;
import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.Major;
import com.fby.dbs.model.entity.Role;
import com.fby.dbs.model.entity.Student;
import com.fby.dbs.model.vo.StudentVo;
import com.fby.dbs.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author fby
 */
@Slf4j
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private MajorMapper majorMapper;

    @Override
    public ResultDto selectStudentByStudentNum(Student student) {
        Student stu = studentMapper.selectStudentByStudentNum(student);

        StudentVo studentVo = studentConvertStudentVo(stu);
        ResultDto resultDto = new ResultDto();
        resultDto.setData(studentVo);
        return resultDto;
    }

    @Override
    public ResultDto login(Student student) {
        Student stu = studentMapper.selectStudentByStudentNum(student);
        ResultDto resultDto = new ResultDto();

        if(stu == null) {
            resultDto.setMessage("查询的学号不存在");
        } else {
            log.info(stu.toString());
            log.info(student.toString());



            if (stu.getStuPassword().equals(student.getStuPassword())) {
                StudentVo studentVo = studentConvertStudentVo(stu);
                resultDto.setData(studentVo);

            } else {
                resultDto.setMessage("操作成功，但是密码错误");
            }

        }




        return resultDto;
    }

    private StudentVo studentConvertStudentVo(Student stu) {
        Role role = roleMapper.selectByPrimaryKey(stu.getStuRoleId());
        Major major = majorMapper.selectByPrimaryKey(stu.getStuMajorId());
        StudentVo studentVo = new StudentVo();
        studentVo.setRole(role);
        studentVo.setMajor(major);
        studentVo.setId(stu.getId());
        studentVo.setStuName(stu.getStuName());
        studentVo.setStuNum(stu.getStuNum());
        studentVo.setStuPassword(stu.getStuPassword());
        studentVo.setStuPhone(stu.getStuPhone());
        studentVo.setStuRegisterDate(stu.getStuRegisterDate());
        studentVo.setStuSex(stu.getStuSex());
        return studentVo;
    }


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    @Override
    public Student selectByPrimaryKey(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }
}



