package lesson9.implementation;

import lesson9.Automobile;
import lesson9.MaxDistance;

public class Track extends Automobile {
    public Track(String name, int distance) {
        super(name, distance);

    }

    @Override
    public void move() {
        super.move();
        if (this.getDistance() <= MaxDistance.MAX_DISTANCE_TRACK) {
            System.out.println(" проехал дистанцию " + this.getDistance());
        } else {
            System.out.println(" не может проехать дистанцию " + this.getDistance());
        }
    }
}
