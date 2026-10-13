package com.webworks.design.pattern.proxy.solution.virtualproxy;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //No load movie will be performed
        Video video1 = new MovieProxy("Inception.mp4");
        Video video2 = new MovieProxy("Dangal.mp4");
        Video video3 = new MovieProxy("PK.mp4");

        //Movie will be loaded first time
        video1.play();
        video2.play();
        video3.play();

        //Movie will be played instantly due to null check
        video1.play();
        video2.play();
        video3.play();

    }
}