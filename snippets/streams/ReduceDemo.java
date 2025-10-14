package snippets.streams;

import java.util.List;

/*
 * Conteúdo: Trabalhando com Streams
 * Caso de uso: Usando o reduce para agregação de valores
 * Data de criação: 14/10/2025
 */

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> numbs = List.of(10, 20, 30, 40, 50);

        System.out.println("Soma dos números ...: " + numbs.stream().reduce(0, Integer::sum));
        System.out.println("Maior número ...: " + numbs.stream().reduce(0, Integer::max));
        System.out.println("Menor número ...: " + numbs.stream().reduce(Integer::min));
    }
}
