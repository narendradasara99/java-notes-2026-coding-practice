package com.example.demo;

public class Order {

    private Integer orderId;
    private String product;
    private Double amount;

    public Order() {
    }

    public Order(Integer orderId, String product, Double amount) {
        this.orderId = orderId;
        this.product = product;
        this.amount = amount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}