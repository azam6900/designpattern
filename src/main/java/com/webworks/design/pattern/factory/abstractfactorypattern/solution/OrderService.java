package com.webworks.design.pattern.factory.abstractfactorypattern.solution;

public class OrderService {

    public void sendNotification() {
        NotificationFactory factory = new EmailFactory();
        Notification notification = factory.createNotification();
        Template template = factory.createTemplate();
        notification.send();
        template.format();
    }
}