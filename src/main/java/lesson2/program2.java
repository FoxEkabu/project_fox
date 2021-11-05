package lesson2;

public class program2 {
    public static void main(String[] args) {
        System.out.println("Привет ВСЕМ");
        int x=45;
        int y=12;
        System.out.print("Первый аргумент X=");
        System.out.println(x);
        System.out.print("Первый аргумент Y=");
        System.out.println(y);
        // метод сложения
        long summa=summa(x,y);
        System.out.print("Результат сложения ");
        System.out.println(summa);
        // метод вычитания
        long minus=minus(x,y);
        System.out.print("Результат вычитания ");
        System.out.println(minus);
        // метод умножения
        long multiplication=multiplication(x,y);
        System.out.print("Результат умножения ");
        System.out.println(multiplication);
        //метот деления
        double division=division(x,y);
        System.out.print("Результат деления ");
        System.out.println(division);

    }

    /**
     *
     * @param per1 первый аргумент
     * @param per2 второй аргумент
     * @return результат сложения
     */
    public static int summa(int per1,int per2) {
    int result=per1 + per2; // операция сложения
    return result;
    }
    /**
     *
     * @param per1 первый аргумент
     * @param per2 второй аргумент
     * @return результат вычитания
     */
    public static int minus(int per1,int per2) {
        return per1-per2;
        }

    /**
     *
      * @param per1 первый аргумент
     * @param per2 второй аргумент
     * @return результат умножения
     */
        public static int multiplication(int per1,int per2) {
        return per1*per2;
    }
    /**
     *
     * @param per1 первый аргумент
     * @param per2 второй аргумент
     * @return результат деления
     */
        public static double division(double per1,double per2) {
            return per1/per2;
    }

}

