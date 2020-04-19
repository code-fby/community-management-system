package com.fby.dbs.model.vo;

import com.fby.dbs.model.entity.Club;
import com.fby.dbs.model.entity.Teacher;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class ActivityVo {

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
    private Teacher activityAuditor;


    private ArrayList<Club> clubs;

}
