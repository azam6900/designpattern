package com.webworks.design.pattern.adaptor.solution;

public class PaymentClient {
    PaymentService paymentService;

    public PaymentClient(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void makePayment() {
        String result = paymentService.pay(100, 123);

        if(result.equals("SUCCESS")) {
            System.out.println("Payment done successfully");
        } else {
            System.out.println("Payment failed");
        }
    }
}