package com.webworks.solid.interfacesegregationprincipal.problem;

public class BackEndDeveloper implements Employee {
    @Override
    public void writeCode() {
        System.out.println("Writing backend code");
    }

    @Override
    public void testCode() {
        System.out.println("Doing dev testing");
    }

    @Override
    public void deployApplication() {
        throw new UnsupportedOperationException("Backend developer does not deploy application");
    }
}