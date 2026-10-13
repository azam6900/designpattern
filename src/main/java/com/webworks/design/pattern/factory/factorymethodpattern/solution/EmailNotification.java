package com.webworks.design.pattern.factory.factorymethodpattern.solution;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending email");
    }
}