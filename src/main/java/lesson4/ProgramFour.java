package lesson4;

public class ProgramFour {
    public static void main(String[] args) {
        // i - счетчик, value - аргумент извлечения квадратного корня
        int i = 1;
        int value = 51;
        int square;
        for (i = 1; i * i <= value; i++) {
        }
        i = i - 1;


        square = i * i;
        if (value - square == 0) {
            System.out.println("Квадратный корень из " + value + " равен " + i);
        } else {
            int ostatok = value - square;
            int  valueDop=i;
            int  valueSquare=i;
            // получение дробной части квадратного корня
            double drob=drob(ostatok,valueDop);
        }

    }

    public static double drob(int ostatok, int valueDop) {
        int dischargeValue;
        int discharge=1;
//вычислем 4 разряда дробной части
        while (discharge<=4){
            valueDop = valueDop * 2;
            int i;
            for (i = 1; valueDop * 10 + i <= ostatok * 100; i++) {
            }
            valueDop = valueDop * 10 + i - 1;
            ostatok = ostatok - valueDop;
            discharge++;

        }
        return valueDop;
    }
}