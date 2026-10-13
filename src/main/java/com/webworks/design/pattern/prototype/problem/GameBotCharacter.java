package com.webworks.design.pattern.prototype.problem;

public class GameBotCharacter {
    private String name;
    private int health;
    private int attackPower;

    public GameBotCharacter(String name, int health, int attackPower) {

        //Let's assume if performs some expensive operations
        System.out.println("Loading character animation from DB");
        System.out.println("Loading sound effect from DB");
        System.out.println("Preparing AI battle settings file");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error in thread");
            throw new RuntimeException(e);
        }

        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    @Override
    public String toString() {
        return "GameBotCharacter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attackPower=" + attackPower +
                '}';
    }
}