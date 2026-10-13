package com.webworks.design.pattern.strategy.solution;

public class GzipStrategy implements CompressionStrategy {
    @Override
    public void compress() {
        System.out.println("GZIP compressed");
    }
}