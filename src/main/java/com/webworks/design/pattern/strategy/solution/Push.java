package com.webworks.design.pattern.strategy.solution;

public class Push extends Notification {

    public Push(CompressionStrategy compressionStrategy, EncryptionStrategy encryptionStrategy) {
        super(compressionStrategy, encryptionStrategy);
    }

    @Override
    public void send() {
        System.out.println("Sending Push Notification");
    }

}