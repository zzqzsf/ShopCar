package org.lanqiao.cart.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lanqiao.cart.entity.OrderItem;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer orderitemId);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Integer orderitemId);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}