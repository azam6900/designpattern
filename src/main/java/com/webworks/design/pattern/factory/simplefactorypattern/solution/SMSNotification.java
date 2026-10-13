package com.webworks.design.pattern.factory.simplefactorypattern.solution;

public class SMSNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending SMS");
    }
}