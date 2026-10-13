package com.webworks.design.pattern.proxy.solution.remoteproxy.localserver;

import com.webworks.design.pattern.proxy.solution.remoteproxy.remoteserver.Weather;

public class Main {
    public static void main(String[] args) {
        Weather weather = new WeatherProxy();
        System.out.println(weather.getWeather());
    }
}