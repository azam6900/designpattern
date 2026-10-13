package com.webworks.solid.depedencyinversionprincipal.solution;

public class MySQLDatabase implements Database {
    @Override
    public void save(String user) {
        System.out.println("Saving data in MySQL : " + user);
    }
}