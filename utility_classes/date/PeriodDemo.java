package utility_classes.date;

import java.time.LocalDate;
import java.time.Period;

/*
 * Conteúdo: Classes Utilitárias 
 * Caso de uso: Trabalhando com datas, classe Period para retornar intervalos de tempo
 * Data de criação: 24/09/2025
 */

public class PeriodDemo {
    public static void main(String[] args) {
        // Retorna o valor do segundo período menos o valor do primeiro
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusYears(6).plusDays(21)));
    }
}
