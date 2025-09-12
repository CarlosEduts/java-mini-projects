package projects.student_management;

import java.util.Scanner;

import projects.student_management.service.StudentManager;
import projects.student_management.view.Menu;

/*
 * Projeto: Sistema de Gerenciamento de Estudantes
 * Objetivos:
 *  - Trabalhar com múltiplos objetos organizados em lista (ArrayList)
 *  - Implementar um CRUD completo: adicionar, listar, buscar, editar e remover estudantes
 *  - Aplicar princípios de orientação a objetos (POO)
 *  - Separar responsabilidades em camadas (model, service, view)
 *  - Criar um menu interativo com entrada do usuário via terminal
 * Data de criação: 28/07/2025
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        StudentManager studentManager = new StudentManager();

        while (true) {
            menu.initialMenu();
            int action = input.nextInt();
            input.nextLine();
            menu.selectedAction(action);

            if (action == 1) {
                System.out.print("Nome: ");
                String name = input.nextLine();

                System.out.print("Email: ");
                String email = input.nextLine();

                System.out.print("Idade: ");
                int age = input.nextInt();
                input.nextLine();

                studentManager.addStudent(name, email, age);

            } else if (action == 2) {
                studentManager.listStudents();

            } else if (action == 3) {
                System.out.print("Email: ");
                String email = input.nextLine();

                studentManager.findStudentByEmail(email);

            } else if (action == 4) {
                System.out.print("Nome: ");
                String name = input.nextLine();

                studentManager.findStudentByName(name);

            } else if (action == 5) {
                System.out.print("Email: ");
                String email = input.nextLine();

                System.out.print("Nome: ");
                String name = input.nextLine();

                System.out.print("Idade: ");
                int age = input.nextInt();
                input.nextLine();

                studentManager.updateStudent(name, email, age);

            } else if (action == 6) {
                System.out.print("Index do estudante: ");
                int index = input.nextInt();
                input.nextLine();

                studentManager.removeStudent(index);
            } else {
                System.out.println("Saindo...");
                break;
            }
        }

        input.close();
    }
}
