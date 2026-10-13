package com.webworks.solid.openclosedprincipal.solution;

public class UPIPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Processing UPI Payment");
    }
}