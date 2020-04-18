package com.fby.dbs.controller;

import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.College;
import com.fby.dbs.service.CollegeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (College)表控制层
 *
 * @author makejava
 * @since 2020-04-10 19:49:58
 */
@RestController
@RequestMapping("college")
public class CollegeController {
    /**
     * 服务对象
     */
    @Resource
    private CollegeService collegeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public College selectOne(Integer id) {
        return this.collegeService.selectByPrimaryKey(id);
    }

    @GetMapping("all")
    public ResultDto selectAll() {
        return collegeService.selectAll();
    }

}
