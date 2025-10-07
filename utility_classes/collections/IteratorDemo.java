package utility_classes.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/*
 * Conteúdo: Classes Utilitárias
 * Caso de uso: Trabalhando com coleções, trabalhando com iteradores
 * Data de criação: 07/10/2025
 */

class Fruit {
    private String name;
    private double price;

    Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "fruits{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class IteratorDemo {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Fruit("Banana", 5.00));
        fruits.add(new Fruit("Maçã", 3.50));
        fruits.add(new Fruit("Uva", 8.00));

        System.out.println("Todas as frutas ...: " + fruits);

        // Usando Iterator para remover frutas com preço maior que 6
        Iterator<Fruit> fruitsIterator = fruits.iterator();
        while (fruitsIterator.hasNext()) {
            if (fruitsIterator.next().getPrice() > 6) {
                fruitsIterator.remove();
            }
        }
        System.out.println("Frutas com preço menor que 6 ...: " + fruits);

        // Maneira de fazer com programação funcional
        fruits.removeIf(fruit -> fruit.getPrice() > 6);
    }
}
