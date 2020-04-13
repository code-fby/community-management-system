package com.fby.dbs.model;

import lombok.Data;

@Data
public class ResultDto {

    private String code="0";

    private String  message="操作成功";

    private Object data;
}
