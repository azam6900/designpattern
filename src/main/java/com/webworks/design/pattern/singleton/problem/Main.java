package com.webworks.design.pattern.singleton.problem;

public class Main {
    public static void main(String[] args) {
        //Calculator is not singleton because multiple instances of this class can be created
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();

        cal1.a = 7;
        cal1.b = 9;

        cal2.a = 5;
        cal2.b = 19;

        System.out.println("Sum of cal1 is : " + cal1.sum());
        System.out.println("Sum of cal2 is : " + cal2.sum());

    }
}