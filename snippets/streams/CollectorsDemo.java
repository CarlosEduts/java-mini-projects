package snippets.streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Conteúdo: Trabalhando com Streams
 * Caso de uso: Coletando dados de Streams
 * Data de criação: 15/10/2025
 */

enum Color {
    RED, GREEN, BLUE
}

class Vehicle {
    String name;
    int price;
    Color color;

    Vehicle(String name, int price, Color color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> numbs = List.of(1, 4, 6, 2, 9, 1, 3, 5, 3);

        System.out.println("Informações estatística dos números da lista ...:");
        IntSummaryStatistics numbsCollect = numbs.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(numbsCollect);

        List<Vehicle> Vehicles = List.of(
                new Vehicle("Carro", 20000, Color.RED),
                new Vehicle("Bicicleta", 1500, Color.GREEN),
                new Vehicle("Caminhão", 30000, Color.BLUE),
                new Vehicle("ônibus", 50000, Color.RED),
                new Vehicle("Scooter", 800, Color.GREEN),
                new Vehicle("Motocicleta", 7000, Color.BLUE),
                new Vehicle("Van", 25000, Color.RED)
        );

        System.out.println("\nContagem  do grupo de veículos pela cor ...: ");
        Vehicles.stream()
                .collect(Collectors.groupingBy(Vehicle::getColor, Collectors.counting()))
                .forEach((color, aLong) -> System.out.println(color + ": " + aLong + (aLong > 1 ? " veículos" : " veículo")));
    }
}
