package utility_classes.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Conteúdo: Classes Utilitárias
 * Caso de uso: Trabalhando com coleções, como usar o Map
 * Data de criação: 08/10/2025
 */

class Consumer {
    private String name;

    Consumer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Consumer{name='" + name + "'}";
    }
}

class Book {
    private String name;

    Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{name='" + name + "'}";
    }
}

public class MapDemo {
    public static void main(String[] args) {
        Map<Consumer, List<Book>> consumerBookMap = new HashMap<>();
        consumerBookMap.put(new Consumer("Alice"), List.of(new Book("Maçã"), new Book("Banana")));
        consumerBookMap.put(new Consumer("Bob"), List.of(new Book("Laranja"), new Book("Melancia")));

        // Itera sobre as entradas do mapa
        for (Map.Entry<Consumer, List<Book>> entry : consumerBookMap.entrySet()) {
            System.out.println("--- " + entry.getKey().getName() + " ---");

            // Itera sobre a lista de livros associada ao consumidor
            for (Book fruit : entry.getValue()) {
                System.out.println("+ " + fruit.getName() + " ");
            }
            System.out.println();
        }
    }
}
