package org.launchcode.dotgame.models;

import java.util.Random;

public class Game {

    private int addendOne;
    private int addendTwo;
    private int sum = addendOne + addendTwo;
    private int[] gameSet = new int[3];

    public int getAddendOne() {
        return addendOne;
    }

    public int getAddendTwo() {
        return addendTwo;
    }

    public int getSum() {
        return sum;
    }

    public int[] getGameSet() {
        return gameSet;
    }

    public Game() {}

    public void generateAddends() {
        Random rand = new Random();
        this.addendOne = rand.nextInt(1000);
        this.addendTwo = rand.nextInt(1000);
    }


}
