package com.fby.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "com.fby.dbs.model.entity.Position")
public class Position {
    /**
     * 职位id
     */
    @ApiModelProperty(value = "职位id")
    private Integer id;

    /**
     * 职位名称  会长1 副会长2 会员3 未入社会员4
     */
    @ApiModelProperty(value = "职位名称  会长1 副会长2 会员3 未入社会员4")
    private String positionName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}