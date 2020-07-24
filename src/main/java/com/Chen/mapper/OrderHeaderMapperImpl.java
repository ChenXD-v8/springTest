package com.Chen.mapper;

import com.Chen.common.OrderLineQueryCondition;
import com.Chen.common.OrderLineQueryResult;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

public class OrderHeaderMapperImpl extends SqlSessionDaoSupport implements OrderHeaderMapper {
    private SqlSession sqlSession;
    @Override
    public List<OrderLineQueryResult> selectOrderLinesByCondition(OrderLineQueryCondition condition) {
        sqlSession=getSqlSession();
        OrderHeaderMapper mapper = sqlSession.getMapper(OrderHeaderMapper.class);
        return mapper.selectOrderLinesByCondition(condition);
    }
}
