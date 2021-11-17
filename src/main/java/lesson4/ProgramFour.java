package lesson4;

public class ProgramFour {
    public static void main(String[] args) {
        /* i - счетчик, value - аргумент извлечения квадратного корня, square - результат
        извлечения квадратного корня*/
        int i = 1;
        int value = 51;
        double square;
        //получаем ближайшее или равное value число перемноженное само на себя (квадрат)
        for (i = 1; i * i <= value; i++) {
        }
        square = i - 1;

        if (value != square * square) { // Если квадратный корень не целое число
            // Вчисление разницы между аргументом и ближайшего квадрата числа к аргументу
            double ostatok = value - square * square;
            double squareDop = square;

            // метод получение дробной части квадратного корня, 4 разряда
            square = drob(ostatok, squareDop) / 10000;
        }
        System.out.println("Квадратный корень из " + value + " равен " + square);

    }

    public static double drob(double ostatok, double squareDop) {

        int discharge = 1;
        double square = squareDop;
        //вычислем 4 разряда дробной части квадратного корня делением столбиком
        while (discharge <= 4) {
            squareDop = squareDop * 2;
            int i = 1;
            for (i = 1; (squareDop * 10 + i) * i <= (ostatok * 100); i++) ;
            ostatok = ostatok * 100 - (squareDop * 10 + i - 1) * (i - 1);
            square = square * 10 + i - 1;
            squareDop = square;
            discharge++;

        }
        return square;

    }
}