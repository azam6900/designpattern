package com.webworks.solid.liskovsubstitutionprincipal.problem;

import java.util.AbstractList;
import java.util.List;

public class PaymentClient {

    public void processTransaction(Payment payment) {
        payment.pay();
        payment.refund();
    }

    public static void main(String[] args) {
        System.out.println("PaymentClient is called");
        PaymentClient client = new PaymentClient();
        List<Payment> paymentList = List.of(new CreditCardPayment(), new UPIPayment(), new Crypto());
        for(Payment payment : paymentList)
        {
            client.processTransaction(payment);
        }
    }
}