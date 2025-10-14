package snippets.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Conteúdo: Trabalhando com Streams
 * Caso de uso: Usando flatMap para transformar e achatar listas
 * Data de criação: 14/10/2025
 */

public class FlatMapDemo {
    public static void main(String[] args) {
        List<List<String>> foods = new ArrayList<>();

        List<String> fruits = List.of("Maçã", "Banana", "Melancia");
        List<String> vegetables = List.of("Cenoura", "Batata", "Alface");
        List<String> grains = List.of("Arroz", "Feijão", "Milho");

        foods.add(fruits);
        foods.add(vegetables);
        foods.add(grains);

        // Usando lambda (Código didático, leitura por iniciantes, clareza de intenção)
        foods.stream().flatMap(list -> list.stream()).forEach(food -> System.out.println(food));

        // Usando method reference (Código maduro, conciso, com equipe experiente)
        foods.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
