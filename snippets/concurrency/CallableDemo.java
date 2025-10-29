package snippets.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RandomDoubleList implements Callable<List<Double>> {
    @Override
    public List<Double> call() throws Exception {
        List<Double> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            list.add((double) Math.round(Math.random() * 10));
        }
        return list;
    }
}

/*
 * Conteúdo: Trabalhando com Concorrência
 * Caso de uso: Demonstração do uso de Callable para retornar resultados de tarefas assíncronas, diferente de Runnable que não retorna valores.
 * Data de criação: 29/10/2025
 */

public class CallableDemo {
    public static void main(String[] args) {
        RandomDoubleList randomDoubleList = new RandomDoubleList();

        try (ExecutorService executor = Executors.newFixedThreadPool(4)) {
            List<Double> doubleList01 = executor.submit(randomDoubleList).get();
            List<Double> doubleList02 = executor.submit(randomDoubleList).get();

            System.out.println("Lista randômica 01: " + doubleList01);
            System.out.println("Lista randômica 02: " + doubleList02);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
