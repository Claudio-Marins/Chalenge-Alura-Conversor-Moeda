package utilities;

import entities.coin.CoinConverter;
import entities.temp.TemperatureConverter;

public class Converter {
    public double exchangeDolar(double coin, CoinConverter coinConverter) {
        return coin * coinConverter.getDolar();
    }

    public double exchangeEuro(double coin, CoinConverter coinConverter) {
        return coin * coinConverter.getEuro();
    }

    public double exchangeLibraEstelinas(double coin, CoinConverter coinConverter) {
        return coin * coinConverter.getLibraEsterlinas();
    }

    public double exchangePesoArgentino(double coin, CoinConverter coinConverter) {
        return coin * coinConverter.getPesoArgentino();
    }

    public double exchangePesoChileno(double coin, CoinConverter coinConverter) {
        return coin * coinConverter.getPesoChileno();
    }

    public double converterCelsiusToFahrenheit (double celsius, TemperatureConverter temperatureConverter){
        return temperatureConverter.celsiusToFahrenheit(celsius);
    }
    public double converterCelsiusToKelvin (double celsius, TemperatureConverter temperatureConverter){
        return temperatureConverter.celsiusToKelvin(celsius);
    }
}
