package com.webworks.solid.liskovsubstitutionprincipal.solution;

public interface Payment extends NonRefundablePayment {
    public void refund();
}