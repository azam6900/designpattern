package com.webworks.design.pattern.singleton.solution.usingenum;

public enum  DatabaseConnection {
    // The single instance of this singleton
    INSTANCE;

    // Singleton state / variables
    private String configuration = "Default Config";

    // Singleton actions / methods
    public void connect() {
        System.out.println("Connecting using: " + configuration);
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}