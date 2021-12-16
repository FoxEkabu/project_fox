package lesson11;

public class TravelCheckPointRuner {
    public static void main(String[] args) throws travelCheckPoint {
        Car[] cars = new Car[]{
                new Car("А001АА96", "Легковой", 75, 1.5, 2, 2, 3),
                new Car("А002АА96", "Грузовой", 70, 7, 3, 3, 4),
                new Car("А003АА96", "Легковой", 110, 1, 2.4, 1.8, 2.5),
                new Car("А004АА96", "Грузовой", 11, 25, 2.7, 4.5, 6),
                new Car("А005АА96", "Грузовой", 60, 15, 2.6, 3.8, 5),
                new Car("А006АА96", "Легковой", 80, 3, 2, 2, 3),
                new Car("А007АА96", "Грузовой", 81, 25, 2.4, 2.9, 5),
                new Car("А008АА96", "Легковой", 79, 1.6, 2.2, 2.1, 3),
                new Car("А009АА96", "Грузовой", 50, 15, 2.9, 3, 7),
                new Car("А010АА96", "Легковой", 90, 1.655, 2.4, 1.7, 3),
                new Car("А011АА96", "Легковой", 120, 1.5, 2, 2.8, 3),
                new Car("А012АА96", "Грузовой", 85, 12, 1.8, 3.5, 5.6),
                new Car("А013АА96", "Легковой", 100, 1.5, 2, 2.1, 2.8),
                new Car("А014АА96", "Легковой", 60, 1.5, 2.1, 2.2, 3.1)
        };

        for (Car avto : cars) {
            try {
                avto.controlSpeed();
                avto.controlSpeed100();
                avto.controlWeight();
                avto.controlDimensions();
            } catch (travelCheckPoint e) {
                System.err.println(e.getMessage());
            }

        }
    }
}
