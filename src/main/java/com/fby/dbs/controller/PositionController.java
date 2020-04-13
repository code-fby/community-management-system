package com.fby.dbs.controller;

import com.fby.dbs.model.entity.Position;
import com.fby.dbs.service.PositionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Position)表控制层
 *
 * @author makejava
 * @since 2020-04-10 19:50:53
 */
@RestController
@RequestMapping("position")
public class PositionController {
    /**
     * 服务对象
     */
    @Resource
    private PositionService positionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Position selectOne(Integer id) {
        return this.positionService.selectByPrimaryKey(id);
    }

}
