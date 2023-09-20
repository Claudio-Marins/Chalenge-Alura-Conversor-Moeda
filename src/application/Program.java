package application;

import utilities.Converter;

import java.util.Locale;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Converter converter = new Converter();
        UI ui = new UI();
        do {
            int escolha = ui.optionUI();
            if (escolha == 0) {
                ui.choiceCoin();
            } else {
                ui.choiceTemp();
            }
        } while (ui.endProgramChoice() == 0);
    }
}

