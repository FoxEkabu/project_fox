package lesson7;

public class Tiger {
    int microchipCode;
    int weight;

    public Tiger(int microchipCode, int weight) {
        this.microchipCode = microchipCode;
        this.weight = weight;
    }

    public void run(int distance) {
        if (distance <= 700) {
            System.out.println("Тигр с кодом микрочипа " + this.microchipCode + " пробежал " + distance + " м");
        } else {
            System.out.println(this.microchipCode + " не смог преодолеть препятствие в " + distance + " м");

        }

    }

    public void swimming(int distance) {
        if (distance <= 100) {
            System.out.println("Тигр с кодом микрочипа " + this.microchipCode + " проплыл  " + distance + " м");
        } else {
            System.out.println("Тигр с кодом микрочипа " + this.microchipCode + " не смог проплыть препятствие в " + distance + " м");
        }
    }
}
