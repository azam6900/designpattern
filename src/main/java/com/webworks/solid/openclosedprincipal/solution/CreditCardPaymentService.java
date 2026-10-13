package com.webworks.solid.openclosedprincipal.solution;

public class CreditCardPaymentService implements  PaymentService{
    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment");
    }
}