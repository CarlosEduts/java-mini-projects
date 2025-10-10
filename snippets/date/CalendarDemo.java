package snippets.date;

import java.util.Calendar;

/*
 * Conteúdo: Trabalhando com datas
 * Caso de uso: Utilizando a classe Calendar para manipular datas
 * Data de criação: 22/09/2025
 */

public class CalendarDemo {
    public static void main(String[] Args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Data ...: " + calendar.getTime());
        System.out.println("Dia da semana ...: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do mês ...: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia do ano ...: " + calendar.get(Calendar.DAY_OF_YEAR));
    }
}
