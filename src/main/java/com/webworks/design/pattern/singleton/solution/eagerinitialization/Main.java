package com.webworks.design.pattern.singleton.solution.eagerinitialization;

public class Main {
    public static void main(String[] args) {
        Calculator  cal1 = Calculator.getInstance();
        Calculator  cal2 = Calculator.getInstance();

        cal1.a = 7;
        cal1.b = 9;

        cal2.a = 5;
        cal2.b = 19;

        System.out.println("Sum of cal1 is : " + cal1.sum());
        System.out.println("Sum of cal2 is : " + cal2.sum());

    }
}