package snippets.concurrency;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/*
 * Conteúdo: Trabalhando com Concorrência
 * Caso de uso: Demonstração do uso de ScheduledExecutorService para agendar tarefas para execução futura.
 * Data de criação: 29/10/2025
 */

public class ScheduledExecutorServiceDemo {
    private static final ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(1);

    private static void notifier() {
        // Agenda uma tarefa para ser executada repetidamente com um atraso fixo de 2 segundos
        ScheduledFuture<?> scheduledFuture = scheduledExecutor.scheduleWithFixedDelay(() -> {
            System.out.println("Nova notificação com Delay, Horário: " + LocalTime.now());
        }, 0, 2, TimeUnit.SECONDS);


        scheduledExecutor.schedule(() -> {
            System.out.println("Notificação final, Horário: " + LocalTime.now());

            scheduledFuture.cancel(false); // Cancela a tarefa agendada, o 'false' indica que a tarefa em execução não será interrompida
            scheduledExecutor.shutdown(); // Encerra o ScheduledExecutorService]
        }, 10, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        notifier();
    }
}
