package com.webworks.design.pattern.observer;

public class Main {
    public static void main(String[] args) {
        YouTubeSubscriber subscriber1 = new YouTubeSubscriber("Naman", 1);
        YouTubeSubscriber subscriber2 = new YouTubeSubscriber("Kashi", 2);
        YouTubeSubscriber subscriber3 = new YouTubeSubscriber("Peter", 3);
        YouTubeSubscriber subscriber4 = new YouTubeSubscriber("Sam", 4);

        TheCuriousCoderChannel channel = new TheCuriousCoderChannel();
        channel.subscriber(subscriber1);
        channel.subscriber(subscriber2);
        channel.subscriber(subscriber3);
        channel.subscriber(subscriber4);

        channel.uploadVideo("Observer Pattern", "ObserverPattern.mp4");
    }
}