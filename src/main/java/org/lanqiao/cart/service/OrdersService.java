package org.lanqiao.cart.service;

import org.lanqiao.cart.entity.OrderItem;
import org.lanqiao.cart.entity.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrdersService {
    public int createOrders(List<OrderItem> orderItems, Orders orders);
}
