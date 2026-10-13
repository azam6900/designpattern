package com.webworks.design.pattern.prototype.problem;

public class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        GameBotCharacter gameBotCharacter1 = new GameBotCharacter("bot1", 100, 0);
        GameBotCharacter gameBotCharacter2 = new GameBotCharacter("bot2", 100, 0);
        GameBotCharacter gameBotCharacter3 = new GameBotCharacter("bot3", 100, 0);
        GameBotCharacter gameBotCharacter4 = new GameBotCharacter("bot4", 100, 0);
        GameBotCharacter gameBotCharacter5 = new GameBotCharacter("bot5", 100, 0);

        long endTime = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (endTime - startTime));

    }
}