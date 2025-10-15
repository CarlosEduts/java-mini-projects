package snippets.streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Conteúdo: Trabalhando com Streams
 * Caso de uso: Coletando dados de Streams
 * Data de criação: 15/10/2025
 */

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> numbs = List.of(1, 4, 6, 2, 9, 1, 3, 5, 3);

        // Retorna a informações estatística dos números da lista
        IntSummaryStatistics numbsCollect = numbs.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(numbsCollect);
    }
}
