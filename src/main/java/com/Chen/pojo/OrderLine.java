package com.Chen.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Data
public class OrderLine {
    private BigInteger orderLineId;
    private BigInteger orderHeaderId;
    private int orderLineNumber;
    private String itemCode;
    private String itemName;
    private BigDecimal unitName;
    private BigDecimal quantity;
    private BigDecimal lineAmount;
    private BigInteger objectVersionNumber =new BigInteger("0");
    private Date creationDate=new Date();
    private BigInteger createdBy=new BigInteger("-1");
    private Date lastUpdateDate=new Date();
    private BigInteger lastUpdatedBy=new BigInteger("-1");
}
