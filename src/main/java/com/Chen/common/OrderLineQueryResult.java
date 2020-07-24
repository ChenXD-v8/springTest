package com.Chen.common;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderLineQueryResult {
    private String orderNumber;
    private String customerUserName;
    private String address;
    private String remark;
    private String createdByName;
    private int orderLineNumber;
    private String itemCode;
    private String itemName;
    private BigDecimal unitPrice;
    private BigDecimal quantity;
    private BigDecimal lineAmount;

    @Override
    public String toString() {
        return "{" +
                "订单编号：'" + orderNumber + '\'' +
                ", 客户名称：'" + customerUserName + '\'' +
                ", 客户地址：'" + address + '\'' +
                ", 订单备注：'" + remark + '\'' +
                ", 订单创建人：'" + createdByName + '\'' +
                ", 订单行号：" + orderLineNumber +
                ", 物料编码：'" + itemCode + '\'' +
                ", 物料名称：'" + itemName + '\'' +
                ", 单价：" + unitPrice +
                ", 数量：" + quantity +
                ", 行总价：" + lineAmount +
                '}';
    }
}
