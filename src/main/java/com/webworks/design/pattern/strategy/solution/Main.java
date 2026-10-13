package com.webworks.design.pattern.strategy.solution;

public class Main {
    public static void main(String[] args) {
        Notification email = new Email(new ZipStrategy(), new AESStrategy());
        email.encrypt();
        email.compress();
        Notification sms = new Email(new GzipStrategy(), new AESStrategy());
        sms.encrypt();
        sms.compress();
        Notification push = new Email(new ZipStrategy(), new RSAStrategy());
        push.encrypt();
        push.compress();
    }
}