package com.fby.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value = "com.fby.dbs.model.entity.News")
public class News {
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
    @ApiModelProperty(value = "发文人id")
    private Integer postManId;

    /**
     * 新闻详情
     */
    @ApiModelProperty(value = "新闻详情")
    private String newsDetail;

    /**
     * 新闻审核人id
     */
    @ApiModelProperty(value = "新闻审核人id")
    private Integer newsAuditorId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getReadingQuantity() {
        return readingQuantity;
    }

    public void setReadingQuantity(String readingQuantity) {
        this.readingQuantity = readingQuantity;
    }

    public Date getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public Integer getPostManId() {
        return postManId;
    }

    public void setPostManId(Integer postManId) {
        this.postManId = postManId;
    }

    public String getNewsDetail() {
        return newsDetail;
    }

    public void setNewsDetail(String newsDetail) {
        this.newsDetail = newsDetail;
    }

    public Integer getNewsAuditorId() {
        return newsAuditorId;
    }

    public void setNewsAuditorId(Integer newsAuditorId) {
        this.newsAuditorId = newsAuditorId;
    }
}