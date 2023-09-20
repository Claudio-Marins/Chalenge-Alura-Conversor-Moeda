package application;

import entities.coin.RealExchangePrices;
import entities.coin.TemperatureLogic;
import utilities.Converter;

import javax.swing.*;

public class UI {
   private String[] opcoes = {"Moeda", "Temperatura"};
   private String[] moeda = {"Dolar", "Euro", "Libra Esterlina", "Peso Argentino", "Peso Chileno"};
   private String[] temperatura = {"Kelvin", "Fahrenheit"};
   private Converter converter = new Converter();



    public int optionUI() {
        int escolha = JOptionPane.showOptionDialog(
                null,
                "Qual tipo de conversão gostaria de fazer?",
                "Escolha",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );
        return escolha;
    }

    public void choiceCoin() {
        String input = JOptionPane.showInputDialog("Insira o valor em Reais");
        try {
            double numero = Double.parseDouble(input);
            int escolhaMoeda = JOptionPane.showOptionDialog(
                    null,
                    "Deseja converter reais para...",
                    "Escolha:",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    moeda,
                    moeda[0]
            );

            if (escolhaMoeda == 0) JOptionPane.showInternalMessageDialog(null, converter.exchangeDolar(numero, new RealExchangePrices()));

            if (escolhaMoeda == 1) JOptionPane.showInternalMessageDialog(null, converter.exchangeEuro(numero, new RealExchangePrices()));

            if (escolhaMoeda == 2) JOptionPane.showInternalMessageDialog(null, converter.exchangeLibraEstelinas(numero, new RealExchangePrices()));

            if (escolhaMoeda == 3) JOptionPane.showInternalMessageDialog(null, converter.exchangePesoArgentino(numero, new RealExchangePrices()));

            if (escolhaMoeda == 4) JOptionPane.showInternalMessageDialog(null, converter.exchangePesoChileno(numero, new RealExchangePrices()));

        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número válido.");
        }

    }

    public void choiceTemp() {
        String input = JOptionPane.showInputDialog("Insira a Temperatura em Celsius");
        try {
            double numero = Double.parseDouble(input);
            int escolhaTemp = JOptionPane.showOptionDialog(
                    null,
                    "Deseja converter Celsius para...",
                    "Escolha:",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    temperatura,
                    temperatura[0]
            );
            if (escolhaTemp == 0) JOptionPane.showInternalMessageDialog(null, converter.converterCelsiusToKelvin(numero, new TemperatureLogic()));
            if (escolhaTemp == 1) JOptionPane.showInternalMessageDialog(null, converter.converterCelsiusToFahrenheit(numero, new TemperatureLogic()));
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número válido.");
        }
    }

    public int endProgramChoice() {
        int escolha = JOptionPane.showConfirmDialog(
                null,
                "Deseja fazer outra conversão?",
                "Escolha",
                JOptionPane.YES_NO_OPTION
        );
            return escolha;
    }

}


