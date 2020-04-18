package com.fby.dbs.controller;

import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.Major;
import com.fby.dbs.service.MajorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Major)表控制层
 *
 * @author makejava
 * @since 2020-04-10 19:50:26
 */
@RestController
@RequestMapping("major")
public class MajorController {
    /**
     * 服务对象
     */
    @Resource
    private MajorService majorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Major selectOne(Integer id) {
        return this.majorService.selectByPrimaryKey(id);
    }

    @GetMapping("all")
    public ResultDto selectAll() {
        return majorService.selectAll();
    }

}
