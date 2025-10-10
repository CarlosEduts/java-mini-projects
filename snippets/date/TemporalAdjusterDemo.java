package snippets.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/*
 * Conteúdo: Trabalhando com datas 
 * Caso de uso: Prática - Retornar próximo dia util da semana (Seg, Ter, Qua, Qui, Sex)
 * Data de criação: 24/09/2025
 */

// Apenas para fins de demonstração, deixarei essa classe no mesmo arquivo
class GetNextBusinessDay implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = 1;

        if (dayOfWeek == DayOfWeek.SATURDAY) {
            addDays = 2;
        }

        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nextBusinessDay = now.with(new GetNextBusinessDay());

        System.out.println("Dia atual ...: " + now + " " + now.getDayOfWeek());
        System.out.println("Próximo dia útil ...: " + nextBusinessDay + " " + nextBusinessDay.getDayOfWeek());
    }
}
