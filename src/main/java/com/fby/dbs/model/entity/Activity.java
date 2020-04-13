package com.fby.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value = "com.fby.dbs.model.entity.Activity")
public class Activity {
    @ApiModelProperty(value = "null")
    private Integer id;

    /**
     * 活动名称
     */
    @ApiModelProperty(value = "活动名称")
    private String activityName;

    /**
     * 活动状态  审批中，审核通过，进行中，已结束
     */
    @ApiModelProperty(value = "活动状态  审批中，审核通过，进行中，已结束")
    private String activityStatus;

    /**
     * 活动发起时间
     */
    @ApiModelProperty(value = "活动发起时间")
    private Date activityLaunchTime;

    /**
     * 活动负责人
     */
    @ApiModelProperty(value = "活动负责人")
    private String activityLeader;

    /**
     * 活动开始时间
     */
    @ApiModelProperty(value = "活动开始时间")
    private Date activityStartTime;

    /**
     * 活动结束时间
     */
    @ApiModelProperty(value = "活动结束时间")
    private Date activityEndTime;

    /**
     * 活动简介
     */
    @ApiModelProperty(value = "活动简介")
    private String activityProfile;

    /**
     * 活动目的
     */
    @ApiModelProperty(value = "活动目的")
    private String activityGoal;

    /**
     * 活动地点
     */
    @ApiModelProperty(value = "活动地点")
    private String activityLocation;

    /**
     * 活动审核人id
     */
    @ApiModelProperty(value = "活动审核人id")
    private Integer activityAuditorId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    public Date getActivityLaunchTime() {
        return activityLaunchTime;
    }

    public void setActivityLaunchTime(Date activityLaunchTime) {
        this.activityLaunchTime = activityLaunchTime;
    }

    public String getActivityLeader() {
        return activityLeader;
    }

    public void setActivityLeader(String activityLeader) {
        this.activityLeader = activityLeader;
    }

    public Date getActivityStartTime() {
        return activityStartTime;
    }

    public void setActivityStartTime(Date activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    public Date getActivityEndTime() {
        return activityEndTime;
    }

    public void setActivityEndTime(Date activityEndTime) {
        this.activityEndTime = activityEndTime;
    }

    public String getActivityProfile() {
        return activityProfile;
    }

    public void setActivityProfile(String activityProfile) {
        this.activityProfile = activityProfile;
    }

    public String getActivityGoal() {
        return activityGoal;
    }

    public void setActivityGoal(String activityGoal) {
        this.activityGoal = activityGoal;
    }

    public String getActivityLocation() {
        return activityLocation;
    }

    public void setActivityLocation(String activityLocation) {
        this.activityLocation = activityLocation;
    }

    public Integer getActivityAuditorId() {
        return activityAuditorId;
    }

    public void setActivityAuditorId(Integer activityAuditorId) {
        this.activityAuditorId = activityAuditorId;
    }
}