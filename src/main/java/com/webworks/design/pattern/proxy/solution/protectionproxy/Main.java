package com.webworks.design.pattern.proxy.solution.protectionproxy;

public class Main {
    public static void main(String[] args) {
        Database db1 = new DatabaseProxy("Admin");
        db1.delete();

        Database db2 = new DatabaseProxy("Operator");
        db2.delete();
    }
}