package com.fby.dbs.controller;

import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.Club;
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

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Club selectOne(Integer id) {
        return this.clubService.selectByPrimaryKey(id);
    }

    @GetMapping("all")
    public ResultDto selectAll() {
        return clubService.selectAll();
    }

}
