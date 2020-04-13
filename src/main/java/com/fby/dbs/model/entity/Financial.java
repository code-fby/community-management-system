package com.fby.dbs.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value = "com.fby.dbs.model.entity.Financial")
public class Financial {
    /**
     * 财务单号
     */
    @ApiModelProperty(value = "财务单号")
    private Integer id;

    /**
     * 活动ID
     */
    @ApiModelProperty(value = "活动ID")
    private Integer activityId;

    /**
     * 财务总额
     */
    @ApiModelProperty(value = "财务总额")
    private String financialTotalAmount;

    /**
     * 财务剩余额
     */
    @ApiModelProperty(value = "财务剩余额")
    private String financialSurplusage;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date establishDate;

    /**
     * 创建人id
     */
    @ApiModelProperty(value = "创建人id")
    private Integer establishPeopleId;

    /**
     * 划款额
     */
    @ApiModelProperty(value = "划款额")
    private String transferAmount;

    /**
     * 存款额
     */
    @ApiModelProperty(value = "存款额")
    private String depositAmount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getFinancialTotalAmount() {
        return financialTotalAmount;
    }

    public void setFinancialTotalAmount(String financialTotalAmount) {
        this.financialTotalAmount = financialTotalAmount;
    }

    public String getFinancialSurplusage() {
        return financialSurplusage;
    }

    public void setFinancialSurplusage(String financialSurplusage) {
        this.financialSurplusage = financialSurplusage;
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }

    public Integer getEstablishPeopleId() {
        return establishPeopleId;
    }

    public void setEstablishPeopleId(Integer establishPeopleId) {
        this.establishPeopleId = establishPeopleId;
    }

    public String getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(String transferAmount) {
        this.transferAmount = transferAmount;
    }

    public String getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(String depositAmount) {
        this.depositAmount = depositAmount;
    }
}