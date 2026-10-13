package com.webworks.design.pattern.prototype.solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        GameBotCharacter gameBotCharacter1 = new GameBotCharacter("bot1", 100, 0,
                new ArrayList<>(Arrays.asList("Riffle")));
        GameBotCharacter gameBotCharacter2 = gameBotCharacter1.customeClone();
        gameBotCharacter2.setName("bot2");
        GameBotCharacter gameBotCharacter3 = gameBotCharacter1.customeClone();
        gameBotCharacter3.setName("bot3");
        GameBotCharacter gameBotCharacter4 = gameBotCharacter1.customeClone();
        gameBotCharacter4.setName("bot4");
        GameBotCharacter gameBotCharacter5 = gameBotCharacter1.customeClone();
        gameBotCharacter5.setName("bot5");
        gameBotCharacter5.getWeapons().add("Sniper");

        System.out.println(gameBotCharacter1);
        System.out.println(gameBotCharacter2);
        System.out.println(gameBotCharacter3);
        System.out.println(gameBotCharacter4);
        System.out.println(gameBotCharacter5);

        long endTime = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (endTime - startTime));

    }
}