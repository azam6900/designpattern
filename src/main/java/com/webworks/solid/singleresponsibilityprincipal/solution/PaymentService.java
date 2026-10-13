package com.webworks.solid.singleresponsibilityprincipal.solution;

public class PaymentService {

    public void processPayment () {
        System.out.println("Payment Processed");
    }

    public void processRefund () {
        System.out.println("Refund Processed");
    }
}