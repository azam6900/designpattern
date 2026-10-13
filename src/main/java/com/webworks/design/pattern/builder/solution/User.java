package com.webworks.design.pattern.builder.solution;

public class User {
    private final String name; //required
    private final int age; //required
    private final String email; //required
    private final String city; //optional
    private final String phone; //optional

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.age = userBuilder.age;
        this.email = userBuilder.email;
        this.city = userBuilder.city;
        this.phone = userBuilder.phone;
    }

    // Getters (No Setters to maintain immutability)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "User {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                "}";
    }

    public static class UserBuilder {
        private final String name;
        private final int age;
        private final String email;
        private String city;
        private String phone;

        // Constructor enforces mandatory fields
        public UserBuilder(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }

        public UserBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }


        // The build method that instantiates the final target object
        public User build() {
            // Optional: You can add validation logic here before object creation
            return new User(this);
        }
    }
}