package com.fby.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "com.fby.dbs.model.entity.College")
public class College {
    @ApiModelProperty(value = "null")
    private Integer id;

    /**
     * 学院名称
     */
    @ApiModelProperty(value = "学院名称")
    private String collegeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}