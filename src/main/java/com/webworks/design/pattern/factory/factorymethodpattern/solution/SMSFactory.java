package com.webworks.design.pattern.factory.factorymethodpattern.solution;

public class SMSFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}