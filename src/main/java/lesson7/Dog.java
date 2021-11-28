package lesson7;

public class Dog {
    String nickName;
    double weight;
    boolean Swimming;

    public Dog(String nickName, double weight, boolean swimming) {
        this.nickName = nickName;
        this.weight = weight;
        Swimming = swimming;
    }

    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(this.nickName + " пробежал " + distance + " м");
        } else {
            System.out.println(this.nickName + " не смог преодолеть препятствие в " + distance + " м");

        }

    }

    public void swimming(int distance) {
        if (distance <= 10&this.Swimming) {
            System.out.println(this.nickName + " проплыл  " + distance + " м");
        } else if (!this.Swimming) {
            System.out.println(this.nickName + " не умеет плавать");
        } else {
            System.out.println(this.nickName + " не смог проплыть препятствие в " + distance + " м");
        }
    }

}