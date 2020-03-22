package com.finearter.dbs.domain;


import lombok.Data;

/**
 * @author lwx
 */
@Data
public class House {

    private Integer id;
    private String houseOwner;
    private Double houseArea;
    private Integer decorateStatus;
    private String houseAddress;
    private Integer customerId;

}
