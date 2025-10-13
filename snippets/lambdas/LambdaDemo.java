package snippets.lambdas;

import java.util.List;
import java.util.function.Consumer;

/*
 * Conteúdo: Trabalhando com expressões lambda
 * Caso de uso: Demonstração de uso de expressões lambda para simplificar o código
 * Data de criação: 12/10/2025
 */

@FunctionalInterface
interface Operation {
    int execute(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        // Usando expressão lambda para percorrer uma lista e imprimir cada nome
        List<String> names = List.of("Ana", "Bia", "Lia", "Gui");
        names.forEach(name -> System.out.println("Nome ...: " + name));
        System.out.println();

        // Usando uma função auxiliar com expressão lambda
        System.out.println("Usando função auxiliar:");
        forEach(names, name -> System.out.println("Nome ...: " + name));
        System.out.println();

        // Usando expressões lambda com interface funcional
        Operation sum = (a, b) -> a + b;
        Operation multiply = (a, b) -> a * b;

        System.out.println("Soma ...: " + sum.execute(10, 20));
        System.out.println("Multiplicação ...: " + multiply.execute(5, 10));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T item : list) {
            consumer.accept(item);
        }
    }
}
