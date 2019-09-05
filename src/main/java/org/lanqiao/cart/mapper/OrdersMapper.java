package org.lanqiao.cart.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lanqiao.cart.entity.Orders;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrdersMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}