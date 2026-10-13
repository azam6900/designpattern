package com.webworks.solid.liskovsubstitutionprincipal.solution;

import java.util.List;

public class PaymentClient {

    public void processTransaction(Payment payment) {
        payment.pay();
        payment.refund();
    }

    public void processTransaction(NonRefundablePayment payment) {
        payment.pay();
    }

    public static void main(String[] args) {
        System.out.println("PaymentClient is called");
        PaymentClient client = new PaymentClient();
        List<Payment> paymentList = List.of(new CreditCardPayment(), new UPIPayment());
        for(Payment payment : paymentList)
        {
            client.processTransaction(payment);
        }

        client.processTransaction(new Crypto());
    }
}