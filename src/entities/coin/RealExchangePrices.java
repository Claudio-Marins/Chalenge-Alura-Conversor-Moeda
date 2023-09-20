package entities.coin;

public class RealExchangePrices implements CoinConverter {
    double dolar = 4.86;
    double euro = 5.19;
    double libraEsterlinas = 6.01;
    double pesoArgentino = 0.0014;
    double pesoChileno = 0.0055;

    @Override
    public double getDolar() {
        return dolar;
    }

    @Override
    public double getEuro() {
        return euro;
    }

    @Override
    public double getLibraEsterlinas() {
        return libraEsterlinas;
    }

    @Override
    public double getPesoArgentino() {
        return pesoArgentino;
    }

    @Override
    public double getPesoChileno() {
        return pesoChileno;
    }
}
