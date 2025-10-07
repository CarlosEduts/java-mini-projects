package utility_classes.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

/*
 * Conteúdo: Classes Utilitárias
 * Caso de uso: Trabalhando com coleções, trabalhando com NavigableSet e TreeSet
 * Data de criação: 07/10/2025
 */

class Smartphone implements Comparable<Smartphone> {
    private String brand;
    private String model;

    Smartphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public int compareTo(Smartphone s) {
        return this.brand.compareTo(s.getBrand());
    }
}

public class NavigableSetDemo {
    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphones = new TreeSet<>();
        smartphones.add(new Smartphone("Apple", "iPhone 13"));
        smartphones.add(new Smartphone("Samsung", "Galaxy S21"));
        smartphones.add(new Smartphone("Google", "Pixel 6"));

        // O NavigableSet mantém os elementos ordenados naturalmente de acordo com o
        // compareTo declarado na classe Smartphone
        System.out.println("Todos os smartphones ...: " + smartphones);
    }
}
