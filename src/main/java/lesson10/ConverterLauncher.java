package lesson10;

import java.util.Scanner;

public class ConverterLauncher {

    public static void main(String[] args) {

        Temperature temp = new Temperature();
        double celcius;
        double fareinheit;

        while (true) {
            System.out.println("Выберите способ конвертации:");
            System.out.println("1.Конвертация температуры Цельсия в Фаренгейт");
            System.out.println("2.Конвертация температуры Фаренгейт в Цельсия");
            System.out.println("3.Выход");
            Scanner sc = new Scanner(System.in);
            while (!sc.hasNextInt()) {
                String text = sc.next();
                System.out.println("Ожидается целое число 1-3, а Вы вввели неподходящее " + text);
                System.out.print("Повторите ввод: ");
            }
            int paragraph = sc.nextInt();
            switch (paragraph) {
                case 1:
                    System.out.println("Введите температуру в градуса " + nameTemperature.Цельсия + " для конвертации в градусы " + nameTemperature.Фаренгейт);
                    if (sc.hasNextDouble()) {
                        celcius = sc.nextDouble();
                        System.out.println(celcius + " градуса " + nameTemperature.Цельсия + " = " + temp.getInFarenheit(celcius) + " градусов " + nameTemperature.Фаренгейт);
                    }
                    break;
                case 2:

                    System.out.println("Введите температуру в градусах " + nameTemperature.Фаренгейт + " для конвертации в градусы " + nameTemperature.Цельсия);
                    if (sc.hasNextDouble()) {
                        fareinheit = sc.nextDouble();
                        System.out.println(fareinheit + " градус(ов) " + nameTemperature.Фаренгейт + " = " + temp.getInCelcius(fareinheit) + " градуса " + nameTemperature.Цельсия);
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Ввели неправильное значение.");
                    ;
            }

            System.out.println("------------------------");
        }
    }
}