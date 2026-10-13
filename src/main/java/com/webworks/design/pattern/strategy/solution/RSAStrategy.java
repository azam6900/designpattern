package com.webworks.design.pattern.strategy.solution;

public class RSAStrategy implements EncryptionStrategy {
    @Override
    public void encrypt() {
        System.out.println("RSA encrypted");
    }
}