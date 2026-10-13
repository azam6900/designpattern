package com.webworks.design.pattern.factory.simplefactorypattern.solution;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending email");
    }
}