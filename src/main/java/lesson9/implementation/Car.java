package lesson9.implementation;

import lesson9.Automobile;
import lesson9.MaxDistance;

public class Car extends Automobile {


    public Car(String name, int distance) {
        super(name, distance);

    }

    @Override
    public void move() {
        super.move();
        if (this.getDistance() <= MaxDistance.MAX_DISTANCE_CAR) {
            System.out.println(" проехал дистанцию " + this.getDistance());
        } else {
            System.out.println(" не может проехать дистанцию " + this.getDistance());
        }
    }
}

