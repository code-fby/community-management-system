package com.fby.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "com.fby.dbs.model.entity.StudentClubMappingtable")
public class StudentClubMappingtable {
    @ApiModelProperty(value = "null")
    private Integer id;

    /**
     * 学生id
     */
    @ApiModelProperty(value = "学生id")
    private Integer studentId;

    /**
     * 社团id
     */
    @ApiModelProperty(value = "社团id")
    private Integer clubId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }
}