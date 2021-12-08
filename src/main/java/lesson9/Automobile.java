package lesson9;

public abstract class Automobile {
    private final String name;
    private int distance;

    public Automobile(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public void move(String name, int distance) {
    }


    public String getName() {
        return name;
    }
}
