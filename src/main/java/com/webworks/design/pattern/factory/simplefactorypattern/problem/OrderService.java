package com.webworks.design.pattern.factory.simplefactorypattern.problem;

public class OrderService {

    EmailNotification emailNotification = new EmailNotification();
    SMSNotification smsNotification = new SMSNotification();

    public void sendEmailNotification() {
        emailNotification.send();
    }

    public void sendSMSNotification() {
        smsNotification.send();
    }
}