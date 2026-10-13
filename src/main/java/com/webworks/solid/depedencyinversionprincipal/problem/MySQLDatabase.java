package com.webworks.solid.depedencyinversionprincipal.problem;

public class MySQLDatabase {
    public void saveData(String data) {
        System.out.println("Saving data in MySQL : " + data);
    }
}