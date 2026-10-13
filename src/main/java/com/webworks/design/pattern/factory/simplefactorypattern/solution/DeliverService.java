package com.webworks.design.pattern.factory.simplefactorypattern.solution;

public class DeliverService {
    public void sendNotification() {
        Notification notification = NotificationFactory.createNotification("SMS");
        notification.send();
    }

}