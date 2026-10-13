package com.webworks.solid.depedencyinversionprincipal.solution;

public class UserService {
    private Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public void saveUser(String user) {
        database.save(user);
    }

    public static void main(String[] args) {
        UserService userService1 = new UserService(new MySQLDatabase());
        userService1.saveUser("MySQL user");

        UserService userService2 = new UserService(new MongoDBDatabase());
        userService2.saveUser("MongoDB user");
    }
}