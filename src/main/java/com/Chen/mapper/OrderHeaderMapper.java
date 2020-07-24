package com.Chen.mapper;

import com.Chen.common.OrderLineQueryCondition;
import com.Chen.common.OrderLineQueryResult;

import java.util.List;
import java.util.Map;

public interface OrderHeaderMapper {
    List<OrderLineQueryResult> selectOrderLinesByCondition(OrderLineQueryCondition condition);
}
