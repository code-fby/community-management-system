package com.fby.dbs.controller;

import com.fby.dbs.model.entity.Financial;
import com.fby.dbs.service.FinancialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Financial)表控制层
 *
 * @author makejava
 * @since 2020-04-10 19:50:12
 */
@RestController
@RequestMapping("financial")
public class FinancialController {
    /**
     * 服务对象
     */
    @Resource
    private FinancialService financialService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Financial selectOne(Integer id) {
        return this.financialService.selectByPrimaryKey(id);
    }

}
