package snippets.threads;

/*
 * Conteúdo: Thread Safety
 * Caso de uso: Demonstração de thread safety ao manipular uma lista compartilhada entre múltiplas threads
 * Data de criação: 20/10/2025
 */

import java.util.ArrayList;
import java.util.List;

class FruitsList {
    private final List<String> fruits = new ArrayList<>();

    public synchronized void add(String fruit) {
        fruits.add(fruit);
        System.out.println("Fruta adicionada ...: " + fruit);
    }

    public synchronized void removeFirst() {
        if (!fruits.isEmpty()) {
            String removedFruit = fruits.removeFirst();
            System.out.println("Fruta removida ...: " + removedFruit);
        }
    }

    public int size() {
        return fruits.size();
    }
}

public class ThreadSafeDemo {
    public static void main(String[] args) {
        FruitsList fruitsList = new FruitsList();
        fruitsList.add("Maçã");
        fruitsList.add("Banana");
        fruitsList.add("Laranja");

        /*
         * Tarefa para remover frutas da lista de forma thread-safe
         * O que esta acontecendo: Duas threads tentam remover frutas simultaneamente da lista compartilhada de frutas,
         * mas como o método removeFirst() é sincronizado, apenas uma thread pode acessar esse método por vez.
         * Isso previne condições de corrida e garante que as frutas sejam removidas corretamente sem corromper o estado da lista.
         */
        int fruitsCount = fruitsList.size();
        Runnable removeTask = () -> {
            System.out.println("Thread iniciada ...: " + Thread.currentThread().getName());

            for (int i = 0; i < fruitsCount; i++) {
                fruitsList.removeFirst();
                try {
                    Thread.sleep(50); // Simula algum tempo de processamento
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread thread1 = new Thread(removeTask);
        Thread thread2 = new Thread(removeTask);
        thread1.start();
        thread2.start();
    }
}
