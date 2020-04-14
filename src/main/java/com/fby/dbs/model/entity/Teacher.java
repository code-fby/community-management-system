package com.fby.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value = "com.fby.dbs.model.entity.Teacher")
public class Teacher {
    @ApiModelProperty(value = "null")
    private Integer id;

    /**
     * 教职工号
     */
    @ApiModelProperty(value = "教职工号")
    private String teacherNum;

    /**
     * 登录密码
     */
    @ApiModelProperty(value = "登录密码")
    private String teacherPassword;

    /**
     * 注册时间
     */
    @ApiModelProperty(value = "注册时间")
    private Date teacherRegisterDate;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String teacherName;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String teacherPhone;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private String teacherSex;

    /**
     * 角色ID
     */
    @ApiModelProperty(value = "角色ID")
    private Integer teacherRoleId;

    /**
     * 所属学院id
     */
    @ApiModelProperty(value = "所属学院id")
    private Integer teacherCollegeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(String teacherNum) {
        this.teacherNum = teacherNum;
    }

    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword;
    }

    public Date getTeacherRegisterDate() {
        return teacherRegisterDate;
    }

    public void setTeacherRegisterDate(Date teacherRegisterDate) {
        this.teacherRegisterDate = teacherRegisterDate;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    public String getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex;
    }

    public Integer getTeacherRoleId() {
        return teacherRoleId;
    }

    public void setTeacherRoleId(Integer teacherRoleId) {
        this.teacherRoleId = teacherRoleId;
    }

    public Integer getTeacherCollegeId() {
        return teacherCollegeId;
    }

    public void setTeacherCollegeId(Integer teacherCollegeId) {
        this.teacherCollegeId = teacherCollegeId;
    }
}