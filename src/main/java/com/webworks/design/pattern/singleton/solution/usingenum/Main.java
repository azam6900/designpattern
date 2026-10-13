package com.webworks.design.pattern.singleton.solution.usingenum;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calculator cal1 = Calculator.INSTANCE;
        Calculator cal2 = Calculator.INSTANCE;

        Thread t1 = new Thread(() -> {
            System.out.println(cal1.sum(8, 9));
        });

        Thread t2 = new Thread(() -> {
            System.out.println(cal2.sum(4, 3));
        });

        t1.start();
        t2.start();


        // Accessing the singleton instance globally
        DatabaseConnection conn1 = DatabaseConnection.INSTANCE;
        DatabaseConnection conn2 = DatabaseConnection.INSTANCE;

        // Both references point to the exact same instance
        System.out.println(conn1 == conn2); // Outputs: true

        // Interacting with the singleton
        conn1.connect(); // Outputs: Connecting using: Default Config

        // Changing state via one reference reflects in the other
        conn2.setConfiguration("Production Config");
        conn1.connect(); // Outputs: Connecting using: Production Config
    }
}