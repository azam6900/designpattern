package com.webworks.solid.interfacesegregationprincipal.solution;

public class DevOpsEngineer implements Deployer {
    @Override
    public void deployApplication() {
        System.out.println("Deploying application");
    }
}