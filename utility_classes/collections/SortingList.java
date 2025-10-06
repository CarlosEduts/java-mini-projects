package utility_classes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Conteúdo: Classes Utilitárias
 * Caso de uso: Trabalhando com coleções, ordenação de objetos
 * Data de criação: 06/10/2025
 */

class Car implements Comparable<Car> {
    private String model;
    private String color;

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    // Método responsável por definir a ordem natural dos objetos Car
    @Override
    public int compareTo(Car car) {
        return this.model.compareTo(car.getModel());
    }
}

public class SortingList {
    public static void main(String[] args) {
        // Exemplo de uso da interface List com objetos
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "Preto"));
        cars.add(new Car("Audi", "Branco"));
        cars.add(new Car("Mercedes", "Prata"));

        System.out.println("Carros ...: " + cars);

        Collections.sort(cars);
        System.out.println("Carros ordenados ...: " + cars);
    }
}
