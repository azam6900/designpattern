package com.webworks.design.pattern.prototype.solution;

import java.util.ArrayList;
import java.util.List;

public class GameBotCharacter implements Cloneable<GameBotCharacter> {
    private String name;
    private int health;
    private int attackPower;
    List<String> weapons;

    public GameBotCharacter(String name, int health, int attackPower, List<String> weapons) {

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
        this.weapons = weapons;
    }

    private GameBotCharacter(GameBotCharacter gameBotCharacter) {
        this.name = gameBotCharacter.name;
        this.health = gameBotCharacter.health;
        this.attackPower = gameBotCharacter.attackPower;

        /**
         * NOTE: Uncomment shallow copy and comment deep copy and then run the main class to see the
         * difference in behavior. When Shallow copy is made then a change in one object will
         * reflect in all the objects because they point to the same memory location while deep
         * copy will create a separate instance of it's own copy
         */

        //Shallow copy
        //this.weapons = gameBotCharacter.weapons;

        //Deep copy
        this.weapons = new ArrayList<>(gameBotCharacter.weapons);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public List<String> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<String> weapons) {
        this.weapons = weapons;
    }

    @Override
    public GameBotCharacter customeClone() {
        return new GameBotCharacter(this);
    }

    @Override
    public String toString() {
        return "GameBotCharacter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attackPower=" + attackPower +
                ", weapons=" + weapons +
                '}';
    }

}