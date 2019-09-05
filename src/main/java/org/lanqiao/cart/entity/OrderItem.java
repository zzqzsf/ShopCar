package org.lanqiao.cart.entity;

public class OrderItem {
    private Integer orderitemId;

    private Integer orderId;

    private Integer productId;

    private Float productCount;

    private Float productPrice;

    public Integer getOrderitemId() {
        return orderitemId;
    }

    public void setOrderitemId(Integer orderitemId) {
        this.orderitemId = orderitemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Float getProductCount() {
        return productCount;
    }

    public void setProductCount(Float productCount) {
        this.productCount = productCount;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }
}