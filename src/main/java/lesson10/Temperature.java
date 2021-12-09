package lesson10;

public class Temperature implements Converter {

    private double defaultTemp=0.0;

    public double Temperature(double defaultTemp){
        return this.defaultTemp=defaultTemp;
    }

    @Override
    public double getInFarenheit(double celcius) {
        return ((double)(9/5)*(celcius+32.0));
    }

    @Override
    public double getInCelcius(double farenheit) {
        return ((double)5/9*(farenheit-32.0));
    }


}