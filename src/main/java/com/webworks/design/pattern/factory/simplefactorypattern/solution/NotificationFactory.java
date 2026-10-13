package com.webworks.design.pattern.factory.simplefactorypattern.solution;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        if(type.equals("EMAIL")) {
            return new EmailNotification();
        } else if(type.equals("SMS")) {
            return new SMSNotification();
        }
        throw new IllegalArgumentException("Invalid type");
    }
}