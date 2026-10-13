package com.webworks.solid.liskovsubstitutionprincipal.solution;

import com.webworks.solid.liskovsubstitutionprincipal.solution.Payment;

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