package utility_classes.date;

import java.time.LocalDateTime;
import java.time.Month;

/*
 * Conteúdo: Classes Utilitárias 
 * Caso de uso: Trabalhando com datas, método moderno para trabalhar com data e tempo no Java
 * Data de criação: 23/09/2025
 */

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2020, Month.JUNE, 23, 11, 43, 23);

        System.out.println(dateTime); // Retorna a data e hora completa
        // retorna "dia-do-mês/mês/ano hora:minuto:segundo"
        System.out.println(
                dateTime.getDayOfMonth() + "/"
                        + dateTime.getMonthValue() + "/"
                        + dateTime.getYear() + " "
                        + dateTime.getHour() + ":"
                        + dateTime.getMinute() + ":"
                        + dateTime.getSecond());

    }
}
