package org.launchcode.dotgame.models;

import java.util.Random;

public class Game {

    private int addendOne;
    private int addendTwo;
    private int sum = addendOne + addendTwo;
    private int[] gameSet = new int[3];

    private void generateAddends() {
        Random rand = new Random();
        this.addendOne = rand.nextInt(1000);
        this.addendTwo = rand.nextInt(1000);
    }



}
