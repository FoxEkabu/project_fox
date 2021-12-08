package lesson9;


import lesson9.implementation.Car;
import lesson9.implementation.Track;


import java.util.Random;

public class AutomobileRunner {
    public static void main(String[] args) {

        Automobile[] cars = new Automobile[10];
        for (int i = 0; i < 10; i++) {
            if (new Random().nextInt(2) == 0) {
                cars[i] = new Car("Car",0);


            } else {
                cars[i] = new Track("Track",0);

            }
            System.out.print(cars[i].getName());
            cars[i].move();

        }
    }
}
