package com.webworks.design.pattern.factory.abstractfactorypattern.solution;

public class DeliverService {
    public void sendNotification() {
        NotificationFactory factory = new SMSFactory();
        Notification notification = factory.createNotification();
        Template template = factory.createTemplate();
        notification.send();
        template.format();
    }

}