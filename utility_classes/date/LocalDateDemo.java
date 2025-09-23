package utility_classes.date;

import java.time.LocalDate;

/*
 * Conteúdo: Classes Utilitárias 
 * Caso de uso: Trabalhando com datas, método moderno para trabalhar com datas no Java
 * Data de criação: 23/09/2025
 */

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(date); // Retorna a data completa
        // retorna "dia-do-mês/mês/ano"
        System.out.println(date.getDayOfMonth() + "/" + date.getMonthValue() + "/" + date.getYear());
        System.out.println(date.getMonth()); // Retorna o mês por extenso
        System.out.println(date.getDayOfWeek()); // Retorna o dia da semana por extenso
        System.out.println(date.lengthOfMonth()); // Retorna a quantidade de dias do mês
    }
}
