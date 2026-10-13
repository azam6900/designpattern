package com.webworks.solid.liskovsubstitutionprincipal.problem;

public class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Credit card payment done");
    }

    @Override
    public void refund() {
        System.out.println("Credit card refund done");
    }
}