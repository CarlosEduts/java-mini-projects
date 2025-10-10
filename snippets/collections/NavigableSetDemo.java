package snippets.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

/*
 * Conteúdo: Trabalhando com coleções
 * Caso de uso: Exemplo de uso da interface NavigableSet e da classe TreeSet
 * Data de criação: 07/10/2025
 */

class Smartphone implements Comparable<Smartphone> {
    private String brand;
    private String model;
    private Integer year;

    Smartphone(String brand, String model, int year) {
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

    @Override
    public String toString() {
        return "Smartphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public int compareTo(Smartphone s) {
        return this.year.compareTo(s.getYear());
    }
}

public class NavigableSetDemo {
    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphones = new TreeSet<Smartphone>();
        smartphones.add(new Smartphone("Apple", "iPhone 13", 2021));
        smartphones.add(new Smartphone("Samsung", "Galaxy S24", 2024));
        smartphones.add(new Smartphone("Google", "Pixel 9", 2023));

        // O NavigableSet mantém os elementos ordenados naturalmente de acordo com o
        // compareTo declarado na classe Smartphone
        System.out.println("Todos os smartphones ...: " + smartphones);

        // Obtendo o smartphone mais antigo (menor)
        Smartphone oldest = smartphones.first();
        System.out.println("Smartphone mais antigo ...: " + oldest);

        // Obtendo o smartphone mais novo (maior)
        Smartphone newest = smartphones.last();
        System.out.println("Smartphone mais novo ...: " + newest);

        // Obtendo o smartphone imediatamente anterior ao Samsung
        Smartphone beforeSamsung = smartphones.lower(new Smartphone("Samsung", "Galaxy S24", 2024));
        System.out.println("Smartphone antes do Samsung ...: " + beforeSamsung);

        // Obtendo o smartphone imediatamente posterior ao Samsung
        Smartphone afterSamsung = smartphones.higher(new Smartphone("Samsung", "Galaxy S24", 2024));
        System.out.println("Smartphone depois do Samsung ...: " + afterSamsung);
    }
}
