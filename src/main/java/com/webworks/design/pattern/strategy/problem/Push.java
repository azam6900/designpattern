package com.webworks.design.pattern.strategy.problem;

public class Push implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Push Notification");
    }

    @Override
    public void encrypt() {
        System.out.println("RSA encryption");
    }

    @Override
    public void compress() {
        System.out.println("ZIP compressed");
    }
}