package com.fby.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value = "com.fby.dbs.model.entity.Club")
public class Club {
    @ApiModelProperty(value = "null")
    private Integer id;

    /**
     * 社团名称
     */
    @ApiModelProperty(value = "社团名称")
    private String clubName;

    /**
     * 社团状态  审批中1 已创建2 已解散3
     */
    @ApiModelProperty(value = "社团状态  审批中1 已创建2 已解散3")
    private String clubStatus;

    /**
     * 社团类别id
     */
    @ApiModelProperty(value = "社团类别id")
    private Integer clubTypeId;

    /**
     * 解散时间
     */
    @ApiModelProperty(value = "解散时间")
    private Date destoryTime;

    /**
     * 建立时间
     */
    @ApiModelProperty(value = "建立时间")
    private Date buildTime;

    /**
     * 社团人数
     */
    @ApiModelProperty(value = "社团人数")
    private Integer clubPeoplesNum;

    /**
     * 社团简介
     */
    @ApiModelProperty(value = "社团简介")
    private String clubProfile;

    /**
     * 社团宗旨
     */
    @ApiModelProperty(value = "社团宗旨")
    private String clubGoal;

    /**
     * 社团创建者名称（前端输入）
     */
    @ApiModelProperty(value = "社团创建者名称（前端输入）")
    private String clubCreator;

    /**
     * 审核人id
     */
    @ApiModelProperty(value = "审核人id")
    private Integer clubAuditorId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubStatus() {
        return clubStatus;
    }

    public void setClubStatus(String clubStatus) {
        this.clubStatus = clubStatus;
    }

    public Integer getClubTypeId() {
        return clubTypeId;
    }

    public void setClubTypeId(Integer clubTypeId) {
        this.clubTypeId = clubTypeId;
    }

    public Date getDestoryTime() {
        return destoryTime;
    }

    public void setDestoryTime(Date destoryTime) {
        this.destoryTime = destoryTime;
    }

    public Date getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

    public Integer getClubPeoplesNum() {
        return clubPeoplesNum;
    }

    public void setClubPeoplesNum(Integer clubPeoplesNum) {
        this.clubPeoplesNum = clubPeoplesNum;
    }

    public String getClubProfile() {
        return clubProfile;
    }

    public void setClubProfile(String clubProfile) {
        this.clubProfile = clubProfile;
    }

    public String getClubGoal() {
        return clubGoal;
    }

    public void setClubGoal(String clubGoal) {
        this.clubGoal = clubGoal;
    }

    public String getClubCreator() {
        return clubCreator;
    }

    public void setClubCreator(String clubCreator) {
        this.clubCreator = clubCreator;
    }

    public Integer getClubAuditorId() {
        return clubAuditorId;
    }

    public void setClubAuditorId(Integer clubAuditorId) {
        this.clubAuditorId = clubAuditorId;
    }
}