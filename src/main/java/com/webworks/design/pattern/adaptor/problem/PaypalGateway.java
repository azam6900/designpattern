package com.webworks.design.pattern.adaptor.problem;

public class PaypalGateway {
    public int doTransaction(double amount, int cId) {
        //Paypal's payment logic
        return 1; //1 means payment is successful
    }
}