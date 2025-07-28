package projects.todo_list;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<Task>();
    }

    public void addTask(String title, String description) {
        Task task = new Task(title, description, false);
        this.tasks.add(this.tasks.size(), task);
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Lista de tarefas vazia!");
            return;
        }

        int count = 0;
        for (Task task : tasks) {
            System.out.println("[" + count + "] " + task.toString());
            count++;
        }
    }

    public void markTaskAsDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
            System.out.println(tasks.get(index));
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            this.tasks.remove(index);
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
