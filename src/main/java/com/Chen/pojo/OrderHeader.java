package com.Chen.pojo;

import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@Data
public class OrderHeader {
    private BigInteger orderHeaderId;
    private String orderNumber;
    private BigInteger customerUserId;
    private String remark;
    private BigInteger objectVersionNumber=new BigInteger("0");
    private Date creationDate=new Date();
    private BigInteger createdBy=new BigInteger("-1");
    private Date lastUpdateDate=new Date();
    private BigInteger lastUpdatedBy=new BigInteger("-1");

}
