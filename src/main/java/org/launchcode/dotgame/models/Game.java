package org.launchcode.dotgame.models;

import java.util.Random;

public class Game {

    Random rand = new Random();
    private int addendOne = rand.nextInt(1000);
    private int addendTwo = rand.nextInt(1000);
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

}
