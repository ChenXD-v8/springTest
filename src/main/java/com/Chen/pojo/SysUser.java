package com.Chen.pojo;


import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

@Data
public class SysUser {
    private BigInteger userId;
    private String userNumber;
    private String userName;
    private String address;
    private BigInteger objectVersionNumber=new BigInteger("0");
    private Timestamp creationDate=new Timestamp(new Date().getTime());
    private BigInteger createdBy=new BigInteger("-1");
    private Timestamp lastUpdateDate=new Timestamp(new Date().getTime());
    private BigInteger lastUpdatedBy=new BigInteger("-1");
}
