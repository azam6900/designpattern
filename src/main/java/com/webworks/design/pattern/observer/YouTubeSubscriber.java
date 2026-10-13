package com.webworks.design.pattern.observer;

public class YouTubeSubscriber implements Subscriber {
    private String name;
    private int id;

    public YouTubeSubscriber(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void update(TheCuriousCoderChannel channel) {
        System.out.println("Received notification -> Title: " + channel.getVideoTitle() + " FileName: " +
                channel.videoFileName + " Name: " + name + " ID: " + id);
    }
}