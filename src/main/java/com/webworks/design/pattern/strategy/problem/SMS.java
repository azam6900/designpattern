package com.webworks.design.pattern.strategy.problem;

public class SMS implements Notification {

    @Override
    public void send() {
        System.out.println("Sending SMS");
    }

    @Override
    public void encrypt() {
        System.out.println("AES encrypted");
    }

    @Override
    public void compress() {
        System.out.println("GZIP compressed");
    }
}