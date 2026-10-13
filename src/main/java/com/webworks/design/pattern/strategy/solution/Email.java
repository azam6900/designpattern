package com.webworks.design.pattern.strategy.solution;

public class Email extends Notification {

    public Email(CompressionStrategy compressionStrategy, EncryptionStrategy encryptionStrategy) {
        super(compressionStrategy, encryptionStrategy);
    }

    @Override
    public void send() {
        System.out.println("Sending Email");
    }


}