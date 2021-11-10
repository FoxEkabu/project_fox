package lesson3;

// метод вычисления корней квадратного уравнения a*x^2+b*x+c=0
public class ProgramThree {
    public static void main(String[] args) {
        // присваиваем коэффициенты a, b, c
        double a = 100;
        double b = 10;
        double c = -50;
        double x1;
        double x2;
        //вычисление дискриминанта
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        // проверка первого коэффициента на равенство нулю
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        } else if (discriminant < 0) {
            System.out.println("Нет действительных решений уравнения");
        } else if (discriminant == 0) {
            x1 = -1 * (b / (2 * a));
            System.out.println("Уравнение имеет один корень: " + x1);
        } else {
            x1 = -1 * ((b+Math.sqrt(discriminant)) / (2 * a));
            x2 = -1 * ((b-Math.sqrt(discriminant)) / (2 * a));
            System.out.println("Уравнение имеет два корня: " +x1+" "+x2);
        }


    }

}
