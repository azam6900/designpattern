package com.webworks.design.pattern.builder.solution;

public class LoginService {
    public void registerUser(String name, int age, String email, String city) {

        User user = new User.UserBuilder(name, age, email).setCity(city).build();
       System.out.println("User registered successfully -> " + user);
    }
}