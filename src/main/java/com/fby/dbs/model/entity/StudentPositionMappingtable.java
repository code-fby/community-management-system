package com.fby.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "com.fby.dbs.model.entity.StudentPositionMappingtable")
public class StudentPositionMappingtable {
    @ApiModelProperty(value = "null")
    private Integer id;

    /**
     * 学生ID
     */
    @ApiModelProperty(value = "学生ID")
    private Integer stuId;

    /**
     * 职位ID
     */
    @ApiModelProperty(value = "职位ID")
    private Integer positionId;

    /**
     * 职位开始时间
     */
    @ApiModelProperty(value = "职位开始时间")
    private String positionStartTime;

    /**
     * 职位结束时间
     */
    @ApiModelProperty(value = "职位结束时间")
    private String positionEndTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionStartTime() {
        return positionStartTime;
    }

    public void setPositionStartTime(String positionStartTime) {
        this.positionStartTime = positionStartTime;
    }

    public String getPositionEndTime() {
        return positionEndTime;
    }

    public void setPositionEndTime(String positionEndTime) {
        this.positionEndTime = positionEndTime;
    }
}