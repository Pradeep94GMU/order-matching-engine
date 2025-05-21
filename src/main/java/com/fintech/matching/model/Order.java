package com.fintech.matching.model;

import java.time.LocalDateTime;

public class Order {
    public enum Type {
        BUY, SELL
    }

    private String orderId;
    private Type type;
    private double price;
    private int quantity;
    private LocalDateTime timestamp;

    public Order(String orderId, Type type, double price, int quantity) {
        this.orderId = orderId;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.timestamp = LocalDateTime.now(); // capture time of order creation
    }

    public String getOrderId() {
        return orderId;
    }

    public Type getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("Order[%s - %s - $%.2f - Qty:%d - %s]",
                orderId, type, price, quantity, timestamp);
    }
}
