package snippets.streams;

/*
 * Conteúdo: Trabalhando com Streams
 * Caso de uso: Processamento paralelo com Streams
 * Data de criação: 16/10/2025
 */

public class ParallelDemo {
    public static void main(String[] args) {
        // Abordagem tradicional
        long startTime = System.currentTimeMillis();
        long count = 0;
        for (long i = 0; i < 1_000_000_000L; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Contagem de números pares (sequencial): " + count);
        System.out.println("Tempo gasto (sequencial): " + (endTime - startTime) + " ms");

        // Usando Streams
        startTime = System.currentTimeMillis();
        count = java.util.stream.LongStream.range(0, 1_000_000_000L)
                .filter(i -> i % 2 == 0)
                .count();
        endTime = System.currentTimeMillis();
        System.out.println("Contagem de números pares (stream): " + count);
        System.out.println("Tempo gasto (stream): " + (endTime - startTime) + " ms");

        // Usando Streams em paralelo
        startTime = System.currentTimeMillis();
        count = java.util.stream.LongStream.range(0, 1_000_000_000L)
                .parallel()
                .filter(i -> i % 2 == 0)
                .count();
        endTime = System.currentTimeMillis();
        System.out.println("Contagem de números pares (paralelo): " + count);
        System.out.println("Tempo gasto (paralelo): " + (endTime - startTime) + " ms");
    }
}
