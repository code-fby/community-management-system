package com.fby.dbs.controller;

import com.fby.dbs.model.entity.ClubType;
import com.fby.dbs.service.ClubTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (ClubType)表控制层
 *
 * @author makejava
 * @since 2020-04-10 19:49:23
 */
@RestController
@RequestMapping("clubType")
public class ClubTypeController {
    /**
     * 服务对象
     */
    @Resource
    private ClubTypeService clubTypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ClubType selectOne(Integer id) {
        return this.clubTypeService.selectByPrimaryKey(id);
    }

}
