package com.fby.dbs.model.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * @author lwx
 */


@Data
@ApiModel("用户实体类")
public class User {

    @ApiModelProperty("用户id")
    private Integer id;
    private String name;
    private String sex;
    private String phoneNum;
    private String roleId;
    private String email;
    private String password;

}
