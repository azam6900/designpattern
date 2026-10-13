package com.webworks.design.pattern.builder.solution;

public class EmailService {
    public void sendWelcomeEmail() {
        User user = new User.UserBuilder("Aman", 35, "aman@gmail.com").build();
        System.out.println("Welcome email sent to -> " + user);
    }
}