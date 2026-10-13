package com.webworks.design.pattern.factory.simplefactorypattern.solution;

public class OrderService {

    public void sendNotification() {
        Notification notification = NotificationFactory.createNotification("EMAIL");
        notification.send();
    }
}