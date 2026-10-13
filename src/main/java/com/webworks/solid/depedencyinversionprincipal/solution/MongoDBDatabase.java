package com.webworks.solid.depedencyinversionprincipal.solution;

public class MongoDBDatabase implements Database {
    @Override
    public void save(String user) {
        System.out.println("Storing document in MongoDB : " + user);
    }
}