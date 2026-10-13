package com.webworks.design.pattern.builder.solution;

public class UserMigrationService {
    public void migrateUser() {

        User user = new User.UserBuilder("Rahul", 30, "rahul@gmail.com").build();
        System.out.println("User migrated -> " + user);
    }
}