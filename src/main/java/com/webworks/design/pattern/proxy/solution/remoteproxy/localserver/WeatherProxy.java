package com.webworks.design.pattern.proxy.solution.remoteproxy.localserver;

import com.webworks.design.pattern.proxy.solution.remoteproxy.remoteserver.Weather;
import com.webworks.design.pattern.proxy.solution.remoteproxy.remoteserver.WeatherService;

public class WeatherProxy implements Weather {

    private Weather weather;

    public WeatherProxy() {
        this.weather = new WeatherService();
    }

    @Override
    public String getWeather() {
        authenticate();
        openConnection();
        serializeRequest();

        return sendHttpRequest();
    }

    private void authenticate() {
        System.out.println("Authenticating ...");
    }

    private void openConnection() {
        System.out.println("Opening connection ...");
    }

    private void serializeRequest() {
        System.out.println("Serializing request ...");
    }

    private String sendHttpRequest() {
        System.out.println("Sending HTTP request ...");
        return weather.getWeather();
    }
}