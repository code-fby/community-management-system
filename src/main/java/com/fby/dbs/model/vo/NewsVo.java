package com.fby.dbs.model.vo;

import com.fby.dbs.model.entity.Student;
import com.fby.dbs.model.entity.Teacher;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


@Data
public class NewsVo {

    @ApiModelProperty(value = "null")
    private Integer id;

    /**
     * 新闻标题
     */
    @ApiModelProperty(value = "新闻标题")
    private String newsTitle;

    /**
     * 阅读量
     */
    @ApiModelProperty(value = "阅读量")
    private String readingQuantity;

    /**
     * 发文时间
     */
    @ApiModelProperty(value = "发文时间")
    private Date dispatchTime;

    /**
     * 发文人id
     */
    @ApiModelProperty(value = "发文人")
    private Student student;

    /**
     * 新闻详情
     */
    @ApiModelProperty(value = "新闻详情")
    private String newsDetail;

    /**
     * 新闻简介
     */
    @ApiModelProperty(value = "新闻简介")
    private String newsProfile;

    /**
     * 新闻审核人id
     */
    @ApiModelProperty(value = "新闻审核人")
    private Teacher newsAuditor;


}
