package lesson11;

public class Car {
    private String gosNomer; // госномер
    private String typeCar; // тип автомобиля
    private int speed; // скорость
    private double weight; // вес
    private double width; // ширина
    private double height; // высота
    private double length; // длина

    public Car(String gosNomer, String typeCar, int speed, double weight, double width, double height, double length) {
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

    public int getSpeed() {
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

    public void controlSpeed() throws travelCheckPoint {
        if (speed > 80 && speed <= 100) {

            throw new travelCheckPoint(typeCar + " автомобиль с гос. номером " + gosNomer + " проехал КПП со скоростью " + speed+" км/ч");
        }
    }

    public void controlSpeed100() throws travelCheckPoint {
        if (this.speed > 100) {

            throw new travelCheckPoint(typeCar + " автомобиль с гос. номером " + gosNomer + " проехал КПП со скоростью " + speed + " км/ч, направить наряд полиции на задержание.");
        }

    }

    public void controlWeight() throws travelCheckPoint {
        if (weight >= 8) {

            throw new travelCheckPoint(typeCar + " автомобиль с гос. номером " + gosNomer + " весит  " + weight + "тонн, что превышает допустимый вес, движение запрещено.");
        }
    }

    public void controlDimensions() throws travelCheckPoint {
        if (width>2.5|height>4 ) {
            //System.out.println(typeCar + " автомобиль " + "с гос. номером " + gosNomer + " проехал КПП со скоростью " + speed);
            throw new travelCheckPoint(typeCar + " автомобиль с гос. номером " + gosNomer + " шириной " +width+ " м и высотой "+height +" м превышает доустимые габариты, движение запрещено.");
        }

    }
}
