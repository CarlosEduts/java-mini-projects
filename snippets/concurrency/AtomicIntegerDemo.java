package snippets.concurrency;

/*
 * Conteúdo: Trabalhando com Concorrência
 * Caso de uso: Demonstração do uso de AtomicInteger para operações atômicas em um ambiente concorrente.
 * Data de criação: 21/10/2025
 */

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private int count;
    // O AtomicInteger é usado para operações atômicas em inteiros,
    // permitindo incrementos seguros em ambientes concorrentes sem a necessidade de sincronização explícita.
    private final AtomicInteger countWithAtomicInteger = new AtomicInteger();

    public void increment() {
        count++;
        countWithAtomicInteger.incrementAndGet();
    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getCounteWithAtomicInteger() {
        return countWithAtomicInteger;
    }
}

public class AtomicIntegerDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };

        Thread thread_01 = new Thread(task);
        Thread thread_02 = new Thread(task);
        thread_01.start();
        thread_02.start();

        try {
            thread_01.join();
            thread_02.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Usando um int ...: " + counter.getCount()); // Pode não ser 20000 devido à falta de sincronização
        System.out.println("Usando o AtomicInteger ...: " + counter.getCounteWithAtomicInteger()); // Sempre será 20000

    }
}
