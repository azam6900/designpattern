package com.webworks.solid.liskovsubstitutionprincipal.solution;

import com.webworks.solid.liskovsubstitutionprincipal.solution.Payment;

public class Crypto implements NonRefundablePayment {
    @Override
    public void pay() {
        System.out.println("Crypto payment done");
    }
}