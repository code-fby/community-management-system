package com.fby.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "com.fby.dbs.model.entity.ClubActivityMappingtable")
public class ClubActivityMappingtable {
    @ApiModelProperty(value = "null")
    private Integer id;

    /**
     * 社团ID
     */
    @ApiModelProperty(value = "社团ID")
    private Integer clubId;

    /**
     * 活动ID
     */
    @ApiModelProperty(value = "活动ID")
    private Integer activityId;

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

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }
}