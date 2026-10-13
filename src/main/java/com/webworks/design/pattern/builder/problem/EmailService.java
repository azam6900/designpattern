package com.webworks.design.pattern.builder.problem;

public class EmailService {
    public void sendWelcomeEmail() {
        User user = new User("Aman", 35, "aman@gmail.com");
        System.out.println("Welcome email sent to -> " + user);
    }
}