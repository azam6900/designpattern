package com.webworks.design.pattern.builder.problem;

public class UserMigrationService {
    public void migrateUser() {
        User user = new User("Rahul", 30, "rahul@gmail.com");
        System.out.println("User migrated -> " + user);
    }
}