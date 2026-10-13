package com.webworks.design.pattern.singleton.solution.multithreaded;

public class Calculator {
    int a;
    int b;

    private static Calculator cal;

    private Calculator() {
        System.out.println("Calculator object has been created");
    }

    /**
     *In multithreaded environment when two threads enter the getInstance at the same time
     * they both find the object has not been created yet hence they create two object which
     * defeats the purpose of having a singleton class. To resolve that we have to add
     * synchronized keyword to the getInsatance method
     */
    public synchronized static Calculator getInstance() {
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