package com.fby.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "com.fby.dbs.model.entity.ClubType")
public class ClubType {
    @ApiModelProperty(value = "null")
    private Integer id;

    /**
     * 社团类别名称
     */
    @ApiModelProperty(value = "社团类别名称")
    private String clubTypeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClubTypeName() {
        return clubTypeName;
    }

    public void setClubTypeName(String clubTypeName) {
        this.clubTypeName = clubTypeName;
    }
}