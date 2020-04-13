package com.fby.dbs.controller;

import com.fby.dbs.model.entity.Student;
import com.fby.dbs.model.ResultDto;
import com.fby.dbs.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController  //代表 返回的是一个json数据
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/login")
    public ResultDto login(String stuNum, String stuPassword) {
        Student student = new Student();
        student.setStuNum(stuNum);
        student.setStuPassword(stuPassword);
        ResultDto resultDto = studentService.login(student);
        return resultDto;
    }

    @GetMapping("/info")
    public ResultDto getStudentInfo(String stuNum) {
        Student student = new Student();
        student.setStuNum(stuNum);
        ResultDto resultDto = studentService.selectStudentByStudentNum(student);
        return resultDto;
    }

}
