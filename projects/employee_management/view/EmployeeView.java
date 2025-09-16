package projects.employee_management.view;

import java.util.Scanner;

import projects.employee_management.controller.EmployeeController;
import projects.employee_management.model.Intern;
import projects.employee_management.model.Manager;

public class EmployeeView {

    private Scanner input;
    private EmployeeController controller;

    public EmployeeView(EmployeeController controller) {
        this.input = new Scanner(System.in);
        this.controller = controller;
    }

    public void showMenu() {
        while (true) {
            System.out.println("\n+--- Gerenciamento de Funcionários ---+");
            System.out.println("1 - Adicionar Funcionário");
            System.out.println("2 - Listar Funcionários");
            System.out.println("3 - Mostrar Funcionário por ID");
            System.out.println("4 - Deletar Funcionário");
            System.out.println("5 - Aplicar bonus a Funcionário");
            System.out.println("0 - Sair");
            System.out.println("+--- ----------------------------- ---+\n");

            System.out.print("Escolha: ");
            int action = input.nextInt();
            input.nextLine(); // consume \n

            if (action == 1) {
                System.out.print("Nome: ");
                String name = input.nextLine();

                System.out.print("Salário: ");
                double salary = input.nextDouble();
                input.nextLine();

                System.out.print("Cargo (Manager/Intern): ");
                String role = input.nextLine();

                if (role.equals("Manager")) {
                    Manager employee = new Manager(name, salary, role);
                    controller.addEmployee(employee);

                } else if (role.equals("Intern")) {
                    Intern employee = new Intern(name, salary, role);
                    controller.addEmployee(employee);
                } else {
                    System.out.println("Erro: Cargo não existe, tente novamente.");
                }

            } else if (action == 2) {
                controller.listAllEmployees();

            } else if (action == 3) {
                System.out.print("Funcionário ID: ");
                int id = input.nextInt();
                controller.findEmployeeById(id);

            } else if (action == 4) {
                System.out.print("Funcionário ID: ");
                int id = input.nextInt();
                controller.removeEmployee(id);

            } else if (action == 5) {
                System.out.print("Funcionário ID: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Bonus (ex: 25% == 0,25): ");
                double bonus = input.nextDouble();
                controller.applyEmployeeBonus(id, bonus);

            } else {
                System.out.println("Saindo...");
                break;
            }
        }

        input.close();
    }
}
