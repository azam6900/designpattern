package com.webworks.design.pattern.proxy.problem;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /**
         * Problem here is that we only created the Modie object, and it loads the movie even though
         * we have not even played the movie yet. Ideally it should do lazy initialization and wait until
         * movie is being played
         */
        Video video1 = new Movie("Inception.mp4");
        Video video2 = new Movie("Dangal.mp4");
        Video video3 = new Movie("PK.mp4");
    }
}