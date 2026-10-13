package com.webworks.design.pattern.singleton.solution.doublecheckedlocking;

public class Calculator {
    int a;
    int b;

    private static Calculator cal;

    private Calculator() {
        System.out.println("Calculator object has been created");
    }

    /**
     *However synchronized solves multithreading issue but cause performance degradation in
     * high concurrent environment. Problem here is once the object is created there will a lock
     * ideally once the object is created lock should have been removed. To solve this we need to
     * remove synchronized keyword from method and instead create a synchronized block
     */
    public synchronized static Calculator getInstance() {
        if(cal == null) {
            synchronized (Calculator.class) {
                if (cal == null) {
                    cal = new Calculator();
                }
            }
        }

        return cal;
    }

    public int sum() {
        return a + b;
    }
}