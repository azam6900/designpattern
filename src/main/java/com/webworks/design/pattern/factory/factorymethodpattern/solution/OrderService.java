package com.webworks.design.pattern.factory.factorymethodpattern.solution;

public class OrderService {

    public void sendNotification() {
        NotificationFactory factory = new EmailFactory();
        Notification notification = factory.createNotification();
        notification.send();
    }
}