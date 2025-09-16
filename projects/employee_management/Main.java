package projects.employee_management;

import projects.employee_management.controller.EmployeeController;
import projects.employee_management.view.EmployeeView;

/* 
 * Projeto: Sistema de Gerenciamento de Funcionários
 * Objetivos:
 *  - Implementar herança e polimorfismo com classes Employee, Manager e Intern.
 *  - Organizar o código em arquitetura MVC.
 *  - Criar métodos de CRUD básicos para funcionários.
 * Data de criação: 12/09/2025
*/

public class Main {
    public static void main(String[] args) {
        EmployeeController controller = new EmployeeController();
        EmployeeView view = new EmployeeView(controller);

        view.showMenu();
    }
}
