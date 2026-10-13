package com.webworks.design.pattern.proxy.solution.protectionproxy;


public class DatabaseProxy implements Database {

    private Database db;
    private String role;

    public DatabaseProxy(String role) {
        this.role = role;
        this.db = new MySQLDatabase();
    }

    @Override
    public void delete() {
        if(role.equals("Admin")) {
            db.delete();
        } else {
            System.out.println("Access has been denied");
        }
    }
}