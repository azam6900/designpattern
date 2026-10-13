package com.webworks.design.pattern.factory.abstractfactorypattern.solution;

public interface NotificationFactory {
    Notification createNotification();
    Template createTemplate();
}