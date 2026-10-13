package com.webworks.design.pattern.strategy.problem;

public class Email implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Email");
    }

    @Override
    public void encrypt() {
        System.out.println("AES encryption");
    }

    @Override
    public void compress() {
        System.out.println("ZIP compression");
    }
}