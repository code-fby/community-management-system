package com.fby.dbs.model.vo;

import com.fby.dbs.model.entity.Major;
import com.fby.dbs.model.entity.Role;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
public class StudentVo {
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

    private Role role;

    private Major major;
}
