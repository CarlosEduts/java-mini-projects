package snippets.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Conteúdo: Trabalhando com Streams
 * Caso de uso: Gerando Streams a partir de ranges e iterações
 * Data de criação: 15/10/2025
 */

public class GenerateStreams {
    public static void main(String[] args) {
        System.out.print("Números de 1 a 20 que são pares ...: ");
        IntStream.range(1, 21).filter(num -> num % 2 == 0).forEach(num -> System.out.print(num + ", "));

        System.out.print("\nStream infinita de números, incrementando de 5 em 5 ...: ");
        Stream.iterate(1, num -> num + 5).limit(10).forEach(num -> System.out.print(num + ", "));

        System.out.print("\nSequencia de Fibonacci ...: ");
        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .limit(10)
                .forEach(fib -> System.out.print(fib[0] + ", "));
    }
}
