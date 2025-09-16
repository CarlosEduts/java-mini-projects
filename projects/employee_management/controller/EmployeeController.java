package projects.employee_management.controller;

import projects.employee_management.model.Employee;
import java.util.ArrayList;

public class EmployeeController {
    private ArrayList<Employee> employees;

    public EmployeeController() {
        this.employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void listAllEmployees() {
        if (this.employees.isEmpty()) {
            System.out.println("Lista de funcionários vazia!");
            return;
        }

        for (Employee employee : this.employees) {
            System.out.println(employee.toString());
        }
    }

    public void findEmployeeById(int id) {
        for (Employee employee : this.employees) {
            if (employee.getId() == id) {
                System.out.println(employee.toString());
            } else {
                System.out.println("ID inválido.");
            }
        }
    }

    public void removeEmployee(int id) {
        boolean isRemovedEmployee = this.employees.removeIf(employee -> employee.getId() == id);

        if (isRemovedEmployee) {
            System.out.println("Funcionário removido!");
        } else {
            System.out.println("ID inválido.");
        }
    }

    public void applyEmployeeBonus(int id, double bonus) {
        for (Employee employee : this.employees) {
            if (employee.getId() == id) {
                employee.setBonus(bonus);
                System.out.println("Bonus aplicado ao funcionário!");
            } else {
                System.out.println("ID inválido.");
            }
        }
    }
}
