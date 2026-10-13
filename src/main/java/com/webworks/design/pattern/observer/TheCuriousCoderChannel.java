package com.webworks.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class TheCuriousCoderChannel {
    List<Subscriber> subscribers = new ArrayList<>();
    String videoTitle;
    String videoFileName;

    public String getVideoTitle() {
        return videoTitle;
    }

    public String getVideoFileName() {
        return videoFileName;
    }

    public void subscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifySubscriber() {
        for(Subscriber subscriber: subscribers) {
            subscriber.update(this);
        }
    }

    public void uploadVideo(String videoTitle, String videoFileName) {
        this.videoTitle = videoTitle;
        this.videoFileName = videoFileName;
        System.out.println("Video has been uploaded");
        notifySubscriber();
    }
}