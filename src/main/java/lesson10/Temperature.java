package lesson10;

public class Temperature implements Converter {


    @Override
    public double getInFarenheit(double celcius) {
        return  ((double)9 / 5) * celcius + 32;
    }

    @Override
    public double getInCelcius(double farenheit) {
        return  ((double) 5 / 9) * (farenheit - 32.0);
    }


}