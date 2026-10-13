package com.webworks.design.pattern.strategy.solution;


public class SMS extends Notification {

    public SMS(CompressionStrategy compressionStrategy, EncryptionStrategy encryptionStrategy) {
        super(compressionStrategy, encryptionStrategy);
    }

    @Override
    public void send() {
        System.out.println("Sending SMS");
    }


}