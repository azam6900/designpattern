package com.webworks.design.pattern.builder.problem;

/**
 * Initially User object had 3 field but later city was added. now every client has to change
 * else there will be a compilation error. Also passing a null is not a good design. So one solution
 * can be to create another construction with 4th field so that code remains backward compatible. This is
 * very cumbersome because how many combination you will make. maybe one client want one field and other
 * wants two fields and so on. In this case more appropriate solution would be to have builder design pattern
 */

public class User {
    private String name;
    private int age;
    private String email;
    private String city;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public User(String name, int age, String email, String city) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.city = city;
    }

    @Override
    public String toString() {
        return "User {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                "}";
    }
}