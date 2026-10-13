package com.webworks.solid.depedencyinversionprincipal.problem;

public class MongoDBDatabase {
    public void storeDocument(String data) {
        System.out.println("Storing document in MongoDB : " + data);
    }
}