package snippets.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Conteúdo: Trabalhando com Streams
 * Caso de uso: Filtragem, ordenação e limitação de resultados
 * Data de criação: 14/10/2025
 */

class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

public class StreamsDemo {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Toyota", "Corolla", 2020),
                new Car("Honda", "Civic", 2019),
                new Car("Ford", "Mustang", 2021),
                new Car("Ford", "Focus", 2018),
                new Car("Chevrolet", "Malibu", 2020));

        List<Car> filteredCars = cars.stream()
                .sorted(Comparator.comparing(Car::getYear)) // Ordena por ano
                .filter(car -> car.getYear() >= 2020) // Filtra carros a partir de 2020
                .limit(2) // Limita a 2 resultados
                .collect(Collectors.toList()); // Coleta em uma lista

        filteredCars.forEach(
                car -> System.out.println("Carro ...: " + car.getBrand() + " " + car.getModel() + " " + car.getYear()));

        long countFordCars = cars.stream()
                .filter(car -> car.getBrand().equals("Ford"))
                .count(); // Conta carros
        System.out.println("\nTotal de carros Ford ...: " + countFordCars);
    }
}
