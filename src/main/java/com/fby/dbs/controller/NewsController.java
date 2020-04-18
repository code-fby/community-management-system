package com.fby.dbs.controller;

import com.fby.dbs.model.ResultDto;
import com.fby.dbs.model.entity.News;
import com.fby.dbs.service.NewsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (News)表控制层
 *
 * @author makejava
 * @since 2020-04-10 19:50:37
 */
@RestController
@RequestMapping("news")
public class NewsController {
    /**
     * 服务对象
     */
    @Resource
    private NewsService newsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public News selectOne(Integer id) {
        return this.newsService.selectByPrimaryKey(id);
    }

    @GetMapping("all")
    public ResultDto selectAll(Integer pageIndex,Integer pageSize) {
        return newsService.selectAll(pageIndex,pageSize);
    }

}
