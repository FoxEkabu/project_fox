package lesson2;

public class program2 {
    public static void main(String[] args) {
        System.out.println("Привет ВСЕМ");
        int x=45;
        int y=12;
        System.out.println("Первый аргумент X="+x);
        System.out.println("Первый аргумент Y="+y);
        // метод сложения
        long summa=summa(x,y);
        System.out.println("Результат сложения "+summa);
        // метод вычитания
        long minus=minus(x,y);
        System.out.println("Результат вычитания "+minus);
        // метод умножения
        long multiplication=multiplication(x,y);
        System.out.println("Результат умножения "+multiplication);
        //метот деления
        double division=division(x,y);
        System.out.println("Результат деления "+division);
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

