package lesson6;

import java.util.Scanner;

public class ProgramSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Вычисление максимального, минимального и среднего значения массива");
        System.out.println("--------------");
        // воод значения размера массива
        System.out.print("Введите размер массива: ");
        while (!input.hasNextInt()) {
            String text = input.next();
            System.out.println("Ожидается целое число, а Вы вввели неподходящее " + text);
            System.out.print("Повторите ввод: ");
        }
        int arraySize = input.nextInt();
        double[] intArray = new double[arraySize];
        for (int i = 0; i < intArray.length; i++) { //
            intArray[i] = Math.random();
            System.out.println(intArray[i]);
        }
        double max = intArray[0];
        double min = intArray[0];
        double average = intArray[0];
        // в цикле вычисляем макисмальне и минимальное значение массива, а так же сумму
        for (double index: intArray) {
            if (index > max) max = index;
            if (index < min) min = index;
            average += index;
        }
        // вычисляем среднее значение переменных массива
        average = average / arraySize;
        System.out.println("Максимальная переменная массива " + max);
        System.out.println("Минимальная  переменная массива " + min);
        System.out.println("Среднее      значение   массива " + average);

    }
}
