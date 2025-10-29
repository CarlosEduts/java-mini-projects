package snippets.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * Conteúdo: Trabalhando com Concorrência
 * Caso de uso: Demonstração do uso de ExecutorService para gerenciar threads, permitindo o gerenciamento das tarefas com mais flexibilidade.
 * Data de criação: 28/10/2025
 */

record Task(int identifier) implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", com o id: " + identifier + ", iniciou a tarefa.");
        try {
            TimeUnit.SECONDS.sleep(2); // Simula a demora de uma tarefa
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + ", finalizou a tarefa.");
    }
}

public class ExecutorsDemo {
    public static void main(String[] args) {
        // Cria um pool de threads com um número fixo de threads, nesse caso 4
        System.out.println("=== ExecutorService com Thread Pool ===");
        try (ExecutorService executorService = Executors.newFixedThreadPool(4)) {
            executorService.execute(new Task(1233));
            executorService.execute(new Task(1556));
            executorService.execute(new Task(1288));
            executorService.execute(new Task(1445));
        }

        // Cria um ExecutorService que utiliza uma única thread para executar as tarefas sequencialmente
        System.out.println("\n=== ExecutorService com Single Thread ===");
        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            executorService.execute(new Task(7233));
            executorService.execute(new Task(7556));
            executorService.execute(new Task(7288));
            executorService.execute(new Task(7445));
        }
    }
}
