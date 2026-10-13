package com.webworks.design.pattern.adaptor.solution;

public class Main {
    public static void main(String[] args) {

        //Paypal Adaptor
        PaymentClient payPalClient = new PaymentClient(new PaypalAdaptor(new PaypalGateway()));
        payPalClient.makePayment();

        //RazorPay Adaptor
        PaymentClient razorPayClient = new PaymentClient(new RazorPayAdaptor(new RazorPayGateway()));
        razorPayClient.makePayment();
    }
}