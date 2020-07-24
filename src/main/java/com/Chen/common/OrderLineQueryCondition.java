package com.Chen.common;

import lombok.Data;

import java.math.BigInteger;

public class OrderLineQueryCondition {
    private String orderNumber;
    private int orderLineNumber;
    private String itemCode;
    private String itemName;
    private BigInteger createdBy;
    private BigInteger customerUserId;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = "%"+orderNumber+"%";
    }

    public int getOrderLineNumber() {
        return orderLineNumber;
    }

    public void setOrderLineNumber(int orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = "%"+itemCode+"%";
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = "%"+itemName+"%";
    }

    public BigInteger getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(BigInteger createdBy) {
        this.createdBy = createdBy;
    }

    public BigInteger getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(BigInteger customerUserId) {
        this.customerUserId = customerUserId;
    }

}
