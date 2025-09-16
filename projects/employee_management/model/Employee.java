package projects.employee_management.model;

import java.util.Random;

public abstract class Employee {
    private int id;
    private String name;
    private double salary;
    private String role;
    private static Random random = new Random();

    public Employee(String name, double salary, String role) {
        this.id = random.nextInt(999999999);
        this.name = name;
        this.salary = salary;
        this.role = role;
    }

    public abstract void setBonus(double bonus);

    @Override
    public String toString() {
        return "[ID: " + this.id + "]" + " [Salário: R$" + this.salary + "]" + " [Função: " + this.role + "] "
                + this.name;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
