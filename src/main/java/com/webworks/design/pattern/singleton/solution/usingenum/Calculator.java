package com.webworks.design.pattern.singleton.solution.usingenum;

public enum Calculator {
    // The single instance of this singleton
    INSTANCE;

    // Singleton actions / methods
    public int sum(int a, int b) {
        return a + b;
    }
}