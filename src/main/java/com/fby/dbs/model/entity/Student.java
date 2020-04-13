package com.fby.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(value = "com.fby.dbs.model.entity.Student")
@Data
public class Student {
    @ApiModelProperty(value = "null")
    private Integer id;

    /**
     * 学号
     */
    @ApiModelProperty(value = "学号")
    private String stuNum;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String stuPassword;

    /**
     * 注册账号时间
     */
    @ApiModelProperty(value = "注册账号时间")
    private Date stuRegisterDate;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String stuName;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String stuPhone;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private String stuSex;

    /**
     * 角色ID
     */
    @ApiModelProperty(value = "角色ID")
    private Integer stuRoleId;

    /**
     * 专业id
     */
    @ApiModelProperty(value = "专业id")
    private Integer stuMajorId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }

    public Date getStuRegisterDate() {
        return stuRegisterDate;
    }

    public void setStuRegisterDate(Date stuRegisterDate) {
        this.stuRegisterDate = stuRegisterDate;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public Integer getStuRoleId() {
        return stuRoleId;
    }

    public void setStuRoleId(Integer stuRoleId) {
        this.stuRoleId = stuRoleId;
    }

    public Integer getStuMajorId() {
        return stuMajorId;
    }

    public void setStuMajorId(Integer stuMajorId) {
        this.stuMajorId = stuMajorId;
    }
}
