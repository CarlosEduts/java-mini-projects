package projects.todo_list;

import java.util.Scanner;

/* 
 * Projeto: Sistema de Tarefas (ToDo)
 * Objetivos:
 *  - Trabalhar com múltiplos objetos em lista (ArrayList)
 *  - Controlar estado de cada item (feito ou não).
 *  - Criar um menu interativo com ações encadeadas.
 * Data de criação: 27/07/2025
*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("\n+--- Lista de Tarefas ---+");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Marcar como feita");
            System.out.println("4 - Excluir tarefa");
            System.out.println("0 - Sair");
            System.out.println("+--- ---------------- ---+\n");

            System.out.print("Escolha: ");
            int action = input.nextInt();
            input.nextLine();

            if (action == 1) {
                System.out.print("Título: ");
                String title = input.nextLine();

                System.out.print("Descrição: ");
                String description = input.nextLine();

                taskManager.addTask(title, description);

            } else if (action == 2) {
                taskManager.listTasks();

            } else if (action == 3) {
                System.out.print("Digite o índice da tarefa: ");
                int index = input.nextInt();
                taskManager.markTaskAsDone(index);

            } else if (action == 4) {
                System.out.print("Digite o índice da tarefa: ");
                int index = input.nextInt();
                taskManager.removeTask(index);

            } else {
                System.out.println("Saindo...");
                break;
            }
        }
        input.close();
    }
}
