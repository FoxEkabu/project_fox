package lesson9.implementation;

import lesson9.Automobile;
//import lesson9.maxDistanceAutomobile.MAX_DISTANCE_CAR;

public class Car extends Automobile {


    public Car(String name, int distance) {
        super(name, distance);
    }

    @Override
    public void move(String name, int distance) {
        super.move(name, distance);
        if (distance <= MAX_DISTANCE_CAR) {

        }
    }
}
