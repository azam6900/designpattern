package com.webworks.solid.liskovsubstitutionprincipal.problem;

public class UPIPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("UPI payment done");
    }

    @Override
    public void refund() {
        System.out.println("UPI refund done");
    }

    /**
     * A child class can add functionality
     */
    public void checkBalance() {
        System.out.println("UPI balance checked");
    }
}