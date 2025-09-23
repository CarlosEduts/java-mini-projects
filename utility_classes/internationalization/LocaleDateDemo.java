package utility_classes.internationalization;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/*
 * Conteúdo: Classes Utilitárias 
 * Caso de uso: Trabalhando com datas, internacionalização de datas
 * Data de criação: 22/09/2025
 */

public class LocaleDateDemo {
    public static void main(String[] args) {
        Locale brasilLocale = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
        Locale italyLocale = new Locale.Builder().setLanguage("it").setRegion("IT").build();

        Calendar calendar = Calendar.getInstance();

        System.out.println("Data em português brasileiro (pt-BR) ...: "
                + DateFormat.getDateInstance(DateFormat.FULL, brasilLocale).format(calendar.getTime()));

        System.out.println("Data em italiano (it-IT) ...: "
                + DateFormat.getDateInstance(DateFormat.FULL, italyLocale).format(calendar.getTime()));
    }
}
