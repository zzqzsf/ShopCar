package org.lanqiao.cart.controller;

import org.lanqiao.cart.entity.OrderItem;
import org.lanqiao.cart.entity.Orders;
import org.lanqiao.cart.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class OrderContorller {
    @Autowired
    OrdersService ordersService;


    @RequestMapping("/insertOrder")
    public boolean createOrder(@RequestBody List<OrderItem> orderItems) {
        Orders orders =new Orders();
        orders.setUserId(1);


        return true;
    }

}
