package lesson7;

public class Runner {
    public static void main(String[] args) {
        HouseCat catBarsik = new HouseCat();
        catBarsik.nickName = "Барсик";
        catBarsik.weight = 5;
        catBarsik.Swimming = false;
        HouseCat catMurzik = new HouseCat("Мурзик", 7, false);
        HouseCat catKesha = new HouseCat("Кеша", 15, false);
        System.out.println("-----------");
        catBarsik.run(150);
        catMurzik.run(202);
        catKesha.run(6);

        catBarsik.swimming(5);
        catMurzik.swimming(10);
        catKesha.swimming(12);
        System.out.println("-----------");
        Dog dogSharik = new Dog("Шарик", 20, true);
        Dog dogTuzik = new Dog("Тузик", 21, true);
        Dog dogBobik = new Dog("Бобик", 15, false);

        dogSharik.run(450);
        dogTuzik.run(600);
        dogBobik.run(100);

        dogSharik.swimming(5);
        dogTuzik.swimming(15);
        dogBobik.swimming(3);
        System.out.println("-----------");

        Tiger tiger1 = new Tiger(12345679, 200);
        Tiger tiger2 = new Tiger(34576578, 210);
        Tiger tiger3 = new Tiger(34564566, 275);

        tiger1.run(600);
        tiger2.run(1000);
        tiger3.run(100);
        tiger1.swimming(59);
        tiger2.swimming(209);
        tiger3.swimming(300);

    }

}
