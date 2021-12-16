package lesson11;

public class Car {
    private String gosNomer; // госномер
    private String typeCar; // тип автомобиля
    private double speed; // скорость
    private int weight; // вес
    private double width; // ширина
    private double height; // высота
    private double length; // длина

    public Car(String gosNomer, String typeCar, double speed, int weight, double width, double height, double length) {
        this.gosNomer = gosNomer;
        this.typeCar = typeCar;
        this.speed = speed;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public String getGosNomer() {
        return gosNomer;
    }

    public double getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public void controlSpeed(double speed) throws travelCheckPoint {
        if (speed>80 && speed<100) {
            System.out.println(typeCar+" автомобиль " + "с гос. номером "+gosNomer+" проехал КПП со скоростью "+speed);
        throw new travelCheckPoint();

        }
    }
}
