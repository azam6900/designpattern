package com.webworks.design.pattern.proxy.solution.remoteproxy.remoteserver;

public class WeatherService implements Weather {
    @Override
    public String getWeather() {
        System.out.println("Fetching weather data");
        return "35 Degree Celsius";
    }
}