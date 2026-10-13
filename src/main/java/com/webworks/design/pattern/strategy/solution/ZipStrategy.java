package com.webworks.design.pattern.strategy.solution;

public class ZipStrategy implements CompressionStrategy {
    @Override
    public void compress() {
        System.out.println("ZIP compressed");
    }
}