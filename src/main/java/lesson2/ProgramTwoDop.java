package lesson2;

public class ProgramTwoDop {
    public static void main(String[] args) {
        System.out.println("Привет ВСЕМ");
        double a = 45;
        double b = 12;
        System.out.println("Длина катета a=" + a);
        System.out.println("Длина катета b=" + b);
        // метод вычисление длины гипотенузы в прямоугольном треугольнике
        double dlGipot = dlGipot(a,b);
        System.out.println("Длина гипотенузы " + dlGipot);
    }

    /**
     * @param per1 длина катета a
     * @param per2 длина катета b
     * @return результат длина гипотенузы
     */
    public static double dlGipot(double per1, double per2) {
        return Math.sqrt( Math.pow(per1, 2)+Math.pow(per2, 2));
    }
}