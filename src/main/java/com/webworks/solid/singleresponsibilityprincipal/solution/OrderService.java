package com.webworks.solid.singleresponsibilityprincipal.solution;

public class OrderService {

    public void createOrder () {
        System.out.println("Order Created");
    }

    public void cancelOrder () {
        System.out.println("Order Cancelled");
    }

    public void updateOrder () {
        System.out.println("Order has been updated");
    }
}