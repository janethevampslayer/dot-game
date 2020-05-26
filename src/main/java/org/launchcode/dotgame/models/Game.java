package org.launchcode.dotgame.models;

import javax.persistence.*;
import java.util.Random;

@Entity
@Table(name="game")
public class Game {

    @Id
    @GeneratedValue
    int id;

    @ManyToOne
    public User user;

    Random rand = new Random();
    private int addendOne = rand.nextInt(1000);
    private int addendTwo = rand.nextInt(1000);
    private int sum = addendOne + addendTwo;

    public Game(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAddendOne(int addendOne) {
        this.addendOne = addendOne;
    }

    public void setAddendTwo(int addendTwo) {
        this.addendTwo = addendTwo;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getAddendOne() {
        return addendOne;
    }

    public int getAddendTwo() {
        return addendTwo;
    }

    public int getSum() {
        return sum;
    }

    public Game() {}

}
