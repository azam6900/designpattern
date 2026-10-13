package com.webworks.design.pattern.proxy.solution.protectionproxy;


public class MySQLDatabase implements Database {

    @Override
    public void delete() {
        System.out.println("User deleted");
    }
}