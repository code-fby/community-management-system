package com.fby.dbs.controller;

import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.Club;
import com.fby.dbs.service.ClubService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Club)表控制层
 *
 * @author makejava
 * @since 2020-04-10 19:49:04
 */
@RestController
@RequestMapping("club")
public class ClubController {
    /**
     * 服务对象
     */
    @Resource
    private ClubService clubService;




    @GetMapping("selectByName")
    public ResultDto selectByName(String clubName,Integer pageIndex,Integer pageSize){
        return  clubService.selectByName(clubName,pageIndex,pageSize);
    }


    @GetMapping("selectTotalCount")
    public ResultDto selectTotalCount(){
        return clubService.selectTotalCount();
    }

    @GetMapping("all")
    public ResultDto selectAll(Integer pageIndex,Integer pageSize) {
        return clubService.selectAll(pageIndex,pageSize);
    }

    @GetMapping("selectById")
    public ResultDto selectById(Integer id){
        return clubService.selectByPrimaryKey(id);
    }


    /**
     * 查询指定学生所加入的社团
     * @param studentId
     * @return
     */
    @GetMapping("selectByStudentId")
    public ResultDto selectByStudentId(Integer studentId){
        return clubService.selectByStudentId(studentId);
    }

    /**
     * 加入社团
     * @param clubId
     * @return
     */
    @PutMapping("joinClub")
    public ResultDto joinClub(Integer studentId,Integer clubId){
        return clubService.joinClub(studentId,clubId);
    }


    /**
     * 创建社团
     * @param club
     * @return
     */
    @PutMapping("createClub")
    public ResultDto createClub(Club club){
        return clubService.createClub(club);
    }












}
