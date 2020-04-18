package com.fby.dbs.controller;

import com.fby.dbs.model.ResultDto;
import com.fby.dbs.service.ActivityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Activity)表控制层
 *
 * @author makejava
 * @since 2020-04-10 19:47:49
 */
@RestController
@RequestMapping("activity")
public class ActivityController {
    /**
     * 服务对象
     */
    @Resource
    private ActivityService activityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ResultDto selectOne(Integer id) {
        return this.activityService.selectByPrimaryKey(id);
    }

    @GetMapping("all")
    public ResultDto selectAll(Integer pageIndex,Integer pageSize) {
        return activityService.selectAll(pageIndex,pageSize);
    }

    @GetMapping("selectTotalCount")
    public ResultDto selectTotalCount(){
        return activityService.selectTotalCount();
    }

    @GetMapping("selectTop10")
    public ResultDto selectTop10(){
        return activityService.selectTop10();
    }

    public ResultDto selectById(Integer id){
        return activityService.selectByPrimaryKey(id);
    }

}
