package utility_classes.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

/*
 * Conteúdo: Classes Utilitárias 
 * Caso de uso: Trabalhando com moeda, internacionalização de moeda
 * Data de criação: 22/09/2025
 */

public class LocaleCurrencyDemo {
    public static void main(String[] args) {
        Locale brasilLocale = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
        Locale japanLocale = new Locale.Builder().setLanguage("jp").setRegion("JP").build();

        double value = 100_000.876; // Valor a ser internacionalização

        System.out.println("Moeda no formato padrão do Brasil ...: "
                + NumberFormat.getCurrencyInstance(brasilLocale).format(value));
        System.out.println("Moeda no formato padrão do Japão ...: "
                + NumberFormat.getCurrencyInstance(japanLocale).format(value));
    }
}
