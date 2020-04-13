package com.fby.dbs.controller;

import com.fby.dbs.model.ResultDto;
import com.fby.dbs.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController  //代表 返回的是一个json数据
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/all")
//    @ResponseBody  //代表 返回的是一个json数据
    public ResultDto selectAllTeachers(){
        log.info("userController...");
        return  teacherService.selectAllTeachers();
    }
}
