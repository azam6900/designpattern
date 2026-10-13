package com.webworks.design.pattern.singleton.solution.lazyinitialization;

public class Calculator {
    int a;
    int b;

    private static Calculator cal;

    private Calculator() {
        System.out.println("Calculator object has been created");
    }

    public static Calculator getInstance() {
        //Lazy initialization will only create an object when getInstance is called
        if(cal == null) {
            cal = new Calculator();
        }
        return cal;
    }

    public int sum() {
        return a + b;
    }
}