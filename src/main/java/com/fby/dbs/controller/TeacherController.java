package com.fby.dbs.controller;

import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.Teacher;
import com.fby.dbs.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController  //代表 返回的是一个json数据
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;


    @PutMapping("/signin")
    public ResultDto signIn(Teacher teacher){
        return teacherService.insertSelective(teacher);
    }

    @PostMapping("/login")
    public ResultDto login(String teacherNum,String password){
        return teacherService.login(teacherNum,password);
    }

    @GetMapping("/info")
    public ResultDto info(String teacherNum){
        return teacherService.info(teacherNum);
    }

    @GetMapping("/all")
//    @ResponseBody  //代表 返回的是一个json数据
    public ResultDto selectAllTeachers(){
        log.info("userController...");
        return  teacherService.selectAllTeachers();
    }
}
