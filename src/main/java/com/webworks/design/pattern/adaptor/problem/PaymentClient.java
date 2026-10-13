package com.webworks.design.pattern.adaptor.problem;

public class PaymentClient {
    PaymentService paymentService = new PaymentService();

    public void makePayment() {
        String result = paymentService.pay(100, 123);

        if(result.equals("SUCCESS")) {
            System.out.println("Payment done successfully");
        } else {
            System.out.println("Payment failed");
        }
    }
}