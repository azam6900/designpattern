package com.webworks.solid.openclosedprincipal.solution;

public class NetBankingPaymentService implements PaymentService{
    @Override
    public void processPayment() {
        System.out.println("Processing Net Banking Payment");
    }
}