package lesson3;

// метод вычисления корней квадратного уравнения a*x^2+b*x+c=0
public class ProgramThree {
    public static void main(String[] args) {
        // присваиваем коэффициенты аргументам a, b, c
        double a = 0;
        double b = 4;
        double c = 2;
        double x1;
        double x2;
        //метод вычисление дискриминанта
        double discriminant = discriminant(a, b, c);
        // проверка первого коэффициента на равенство нулю
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
            //проверка дискриминанта
        } else if (discriminant < 0) {
            System.out.println("Нет действительных решений уравнения");
        } else if (discriminant == 0) {
            x1 = -1 * (b / (2 * a));
            System.out.println("Уравнение имеет один корень: " + x1);
        } else {
            x1 = -1 * ((b + Math.sqrt(discriminant)) / (2 * a));
            x2 = -1 * ((b - Math.sqrt(discriminant)) / (2 * a));
            System.out.println("Уравнение имеет два корня: " + x1 + " " + x2);
        }
    }

    public static double discriminant(double a, double b, double c) {
        return (Math.pow(b, 2) - 4 * a * c);
    }
}
