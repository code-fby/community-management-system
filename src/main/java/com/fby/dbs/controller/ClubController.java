package com.fby.dbs.controller;

import com.fby.dbs.model.ResultDto;
import com.fby.dbs.service.ClubService;
import org.springframework.web.bind.annotation.GetMapping;
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





}
