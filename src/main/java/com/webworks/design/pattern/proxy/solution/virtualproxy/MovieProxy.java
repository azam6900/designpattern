package com.webworks.design.pattern.proxy.solution.virtualproxy;

public class MovieProxy implements Video {

    private String fileName;
    private Video video;

    public MovieProxy(String fileName) {
        System.out.println("Proxy object created");
        this.fileName = fileName;
    }

    @Override
    public void play() throws InterruptedException {
        if(video == null) {
            video = new Movie(fileName);
        }

        video.play();
    }
}