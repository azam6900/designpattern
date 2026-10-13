package com.webworks.solid.interfacesegregationprincipal.problem;

public class QAEngineer implements  Employee {
    @Override
    public void writeCode() {
        throw new UnsupportedOperationException("QA engineer does not write code");
    }

    @Override
    public void testCode() {
        System.out.println("Testing application");
    }

    @Override
    public void deployApplication() {
        throw new UnsupportedOperationException("QA engineer does not deploy application");
    }
}