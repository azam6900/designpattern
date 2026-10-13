package com.webworks.solid.singleresponsibilityprincipal.solution;

public class NotificationService {

    public void sendEmail () {
        System.out.println("Email Sent");
    }

    public void sendSMS () {
        System.out.println("SMS Sent");
    }
}