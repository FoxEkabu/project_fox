package lesson5;

public class Tmp {
    public static void main(String[] args) {
        double value=51;
        double num;
                double half=value/2;

                do {
                    num=half;
                    half=(num+(value/num))/2;
                            }
                while ((num-half)!=0);
        System.out.println(half);
    }
}
