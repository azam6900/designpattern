package com.webworks.solid.interfacesegregationprincipal.problem;

public class DevOpsEngineer implements Employee {
    @Override
    public void writeCode() {
        throw new UnsupportedOperationException("DevOps engineer does not write code");
    }

    @Override
    public void testCode() {
        throw new UnsupportedOperationException("DevOps engineer does not test application");
    }

    @Override
    public void deployApplication() {
        System.out.println("Deploying application");
    }
}