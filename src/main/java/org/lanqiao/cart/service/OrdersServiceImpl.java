package org.lanqiao.cart.service;

import org.lanqiao.cart.entity.OrderItem;
import org.lanqiao.cart.entity.Orders;
import org.lanqiao.cart.mapper.OrderItemMapper;
import org.lanqiao.cart.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrdersServiceImpl implements OrdersService {
    @Autowired
    OrdersMapper ordersMapper;

    @Autowired
    OrderItemMapper orderItemMapper;

    @Override
    public int createOrders(List<OrderItem> orderItems, Orders orders) {
        ordersMapper.insertSelective(orders);
        for (OrderItem oi:orderItems) {
            oi.setOrderId(orders.getOrderId());
            orderItemMapper.insertSelective(oi);
        }
        return 0;
    }
}
