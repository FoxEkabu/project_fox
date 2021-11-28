package lesson7;

public class HouseCat {
    String nickName;
    double weight;
    boolean Swimming;

    public HouseCat() {
    }


    public HouseCat(String nickName, double weight, boolean swimming) {
        this.nickName = nickName;
        this.weight = weight;
        this.Swimming = swimming;
    }

    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(this.nickName + " пробежал " + distance+" м");
        } else {
            System.out.println(this.nickName + " не смог преодолеть препятствие в " + distance + " м");

        }

    }

    public void swimming(int distance) {
        System.out.println(this.nickName + " не умеет плавать");
    }
}