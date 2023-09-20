package entities.coin;

public class TemperatureLogic implements TemperatureConverter {

    @Override
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

}
