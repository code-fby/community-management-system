package com.fby.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "com.fby.dbs.model.entity.ClubNewsMappingtable")
public class ClubNewsMappingtable {
    @ApiModelProperty(value = "null")
    private Integer id;

    /**
     * 社团id
     */
    @ApiModelProperty(value = "社团id")
    private Integer clubId;

    /**
     * 新闻id
     */
    @ApiModelProperty(value = "新闻id")
    private Integer newsId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }
}