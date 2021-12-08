package lesson9;

import java.util.Random;

public abstract class Automobile {
    private final String name;
    private final int distance;

    public Automobile(String name, int distance) {
        this.name = name;
        this.distance = (int) Math.round(Math.random() * 1000);
    }

    public void move() {
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

}
