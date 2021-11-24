package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramSixDop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Вычисление элемента последовательности Фибоначчи");
        System.out.println("--------------");
        // воод  номера последовательности Фибоначчи с консоли
        System.out.print("Введите номер элемента: ");
        while (!input.hasNextInt()) {
            String text = input.next();
            System.out.println("Ожидается целое число, а Вы вввели неподходящее " + text);
            System.out.print("Повторите ввод: ");
        }
        int number = input.nextInt();
        // Проверка введенной переменной на равенство 0 или меньше 0
        if (number <= 0) {
            System.out.println("Вы ввели число меньше или равное 0");
        } else {
            int result = 0;
            int[] intArray = new int[number];
            int indexResult;
            intArray[0] = 0;
            intArray[1] = 1;

            // Высиление последовательности Фибоначчи с помещением в массив
            // и элемента последовательности по порядковому номеру
            int previousResult = 0;
            int currentResult = 1;
            for (int i = 2; i < number; i++) {
                result = previousResult + currentResult;
                previousResult = currentResult;
                currentResult = result;
                intArray[i] = result;
            }

            System.out.println(number + " элемент последовательности Фибоначчи равен " + intArray[number - 1]);


            System.out.println("--------------");
            //ввод второй переменной номера последовательности Фибоначчи с консоли
            System.out.print("Введите еще номер элемента: ");
            while (!input.hasNextInt()) {
                String text = input.next();
                System.out.println("Ожидается целое число, а Вы вввели неподходящее " + text);
                System.out.print("Повторите ввод: ");
            }
            int number2 = input.nextInt();
            if (number2 <= 0) {
                System.out.println("Вы ввели число меньше или равное 0");
            } else if (number2 <= number) {
                System.out.println(number2 + " элемент последовательности Фибоначчи равен " + intArray[number2 - 1]);

            } else {
                //копирование вычисленного массива в новый массив и вычисление продолжения последовательности Фибоначчи
                int[] intArray2 = new int[number2];
                System.arraycopy(intArray, 0, intArray2, 0, intArray.length);
                previousResult = intArray2[number - 2];
                currentResult = intArray2[number - 1];
                for (int i = number + 1; i <= number2; i++) {
                    result = previousResult + currentResult;
                    previousResult = currentResult;
                    currentResult = result;
                    intArray2[i - 1] = result;
                }

                System.out.println(number2 + " элемент последовательности Фибоначчи равен " + intArray2[number2 - 1]);

            }
        }
    }
}


