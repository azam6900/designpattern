package com.webworks.design.pattern.singleton.solution.eagerinitialization;

public class Calculator {
    int a;
    int b;

    /**
     * Eager initialization will create an object in memory when class is loaded even no one has asked
     * for it because it is static object. This is a waste of memory
     */
    private static Calculator cal = new Calculator();

    private Calculator() {
    }

    public static Calculator getInstance() {
        return cal;
    }

    public int sum() {
        return a + b;
    }
}