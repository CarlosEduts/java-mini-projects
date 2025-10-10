package snippets.date;

import java.time.LocalDate;
import java.time.Period;

/*
 * Conteúdo: Trabalhando com datas 
 * Caso de uso: Classe Period para retornar intervalos de tempo
 * Data de criação: 24/09/2025
 */

public class PeriodDemo {
    public static void main(String[] args) {
        // Retorna o valor do segundo período menos o valor do primeiro
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusYears(6).plusDays(21)));
    }
}
