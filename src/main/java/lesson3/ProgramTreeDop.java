package lesson3;

import java.util.Scanner;

public class ProgramTreeDop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вычисление факториала числа n!");
        System.out.print("Введите значение n: ");
        int n = scanner.nextInt(); //Ввод и присвоение переменной n
        if (n<0) {
            System.out.println("Число n меньше нуля. Вычисление факториала невозможно.");
        } else {
            int factorialsValue = 1; // присвоение значению факториала натурального числа равное 1
            //  Вычисление факториала
            for (int i = 1; i <= n; i += 1) {
                factorialsValue *= i;
            }
               System.out.println("Факториал числа " + n + " равно " + factorialsValue);}
    }
}

