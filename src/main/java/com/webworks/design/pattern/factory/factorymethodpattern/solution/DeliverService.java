package com.webworks.design.pattern.factory.factorymethodpattern.solution;

public class DeliverService {
    public void sendNotification() {
        NotificationFactory factory = new SMSFactory();
        Notification notification = factory.createNotification();
        notification.send();
    }

}