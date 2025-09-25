package utility_classes.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Conteúdo: Classes Utilitárias 
 * Caso de uso: Trabalhando com datas, uso da classe DateTimeFormatter para formatação de datas
 * Data de criação: 25/09/2025
 */

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        // Transformando a data em uma String formatada
        String isoDate = now.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Data em String ...: " + isoDate);

        // Transformando a String formatada em uma data
        LocalDate parseIsoDate = LocalDate.parse(isoDate, DateTimeFormatter.ISO_DATE);
        System.out.println("Data em LocalDate ...: " + parseIsoDate);

        // Formatação personalizada
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MMMM.yyyy");
        System.out.println("Data com formatação personalizada ...: " + now.format(formatter));
    }
}
