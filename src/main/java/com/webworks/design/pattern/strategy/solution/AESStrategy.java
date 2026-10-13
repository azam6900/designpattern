package com.webworks.design.pattern.strategy.solution;

public class AESStrategy implements EncryptionStrategy {
    @Override
    public void encrypt() {
        System.out.println("AES encrypted");
    }
}