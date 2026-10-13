package com.webworks.solid.liskovsubstitutionprincipal.problem;

public class Crypto implements Payment {
    @Override
    public void pay() {
        System.out.println("Crypto payment done");
    }

    /**
     * But a child class can not reduce functionality. Here is breaks the Liskov Substitution
     * principal. Client does not know about this reduced functionality. For the client the expectation
     * is to process the refund as per the interface. This breaks trust with the client
     */
    @Override
    public void refund() {
        throw new UnsupportedOperationException("Refund is not supported for crypto payment");
    }
}