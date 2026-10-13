package com.webworks.design.pattern.builder.problem;

public class Main {
    public static void main(String[] args) {
        new EmailService().sendWelcomeEmail();
        new UserMigrationService().migrateUser();
        new LoginService().registerUser("Sam", 21, "sam@gmail.com", "Dehli");
    }
}