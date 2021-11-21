package lesson5;

import java.util.Scanner;

public class ProgramFive {
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
            switch (number) {
                case 1: { // Если номер последователоьности равен 1 то элемент равен 0
                    result = 0;
                    break;
                }
                case 2: { // Если номер последователоьности равен 2 то элемент равен 1
                    result = 1;
                    break;
                }
                default: {
                    // Высиление элемента последовательности Фибоначчи по порядковому номеру
                    int previousResult = 0;
                    int currentResult = 1;
                    for (int i = 2; i <= number - 1; i++) {
                        result = previousResult + currentResult;
                        previousResult = currentResult;
                        currentResult = result;
                    }
                }
            }
            System.out.println(number + " элемент последовательности Фибоначчи равен " + result);
        }
    }
}

