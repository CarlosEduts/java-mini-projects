package snippets.concurrency;

import java.util.concurrent.locks.ReentrantLock;

/*
 * Conteúdo: Trabalhando com Concorrência
 * Caso de uso: Demonstração do uso de ReentrantLock para controle de acesso a recursos compartilhados em um ambiente concorrente.
 * Data de criação: 27/10/2025
 */

record Work(String identifier, ReentrantLock reentrantLock) implements Runnable {
    @Override
    public void run() {
        reentrantLock.lock();

        try {
            if (reentrantLock.isHeldByCurrentThread()) {
                System.out.println("+ Thread " + this.identifier + " entrou na seção crítica.");
            }
            System.out.println("- " + reentrantLock.getQueueLength() + " Threads esperando na fila.");
            System.out.println("- Thread " + this.identifier + " em espera de 2 segundos.");
            Thread.sleep(2000);
            System.out.println("+ Thread " + this.identifier + " teve sua espera finalizada. \n");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        } finally {
            reentrantLock.unlock();
        }
    }
}

public class ReentrantLockDemo {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();

        new Thread(new Work("A1", reentrantLock)).start();
        new Thread(new Work("B2", reentrantLock)).start();
        new Thread(new Work("C3", reentrantLock)).start();
        new Thread(new Work("D4", reentrantLock)).start();
        new Thread(new Work("E5", reentrantLock)).start();
    }
}
