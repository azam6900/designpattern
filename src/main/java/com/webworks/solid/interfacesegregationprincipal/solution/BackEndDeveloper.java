package com.webworks.solid.interfacesegregationprincipal.solution;

public class BackEndDeveloper implements Coder, Tester {
    @Override
    public void writeCode() {
        System.out.println("Writing backend code");
    }

    @Override
    public void testCode() {
        System.out.println("Testing application");
    }
}