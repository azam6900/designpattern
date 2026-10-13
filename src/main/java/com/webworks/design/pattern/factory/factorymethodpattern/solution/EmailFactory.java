package com.webworks.design.pattern.factory.factorymethodpattern.solution;

public class EmailFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}