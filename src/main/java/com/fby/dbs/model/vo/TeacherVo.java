package com.fby.dbs.model.vo;


import com.fby.dbs.model.entity.College;
import com.fby.dbs.model.entity.Role;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class TeacherVo {

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
    @ApiModelProperty(value = "角色")
    private Role role;

    /**
     * 所属学院id
     */
    @ApiModelProperty(value = "所属学院")
    private College college;
}
