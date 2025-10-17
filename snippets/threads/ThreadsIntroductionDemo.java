package snippets.threads;

/*
 * Conteúdo: Introdução a Threads
 * Caso de uso: Demonstração básica de criação e execução de múltiplas threads em Java
 * Data de criação: 17/10/2025
 */

record RunThreadTask(String identifier) implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.print(this.identifier() + " ");
        }
    }
}

public class ThreadsIntroductionDemo {
    public static void main(String[] args) {
        Thread thread_01 = new Thread(new RunThreadTask("01"));
        Thread thread_02 = new Thread(new RunThreadTask("02"));
        Thread thread_03 = new Thread(new RunThreadTask("03"));

        thread_01.start();
        thread_02.start();
        thread_03.start();
    }
}
