package projects.employee_management.model;

public class Manager extends Employee {
    public Manager(String name, double salary, String role) {
        super(name, salary, role);
    }

    // Bonus em porcentagem de fração (ex: 25% == 0,25)
    @Override
    public void setBonus(double bonus) {
        setSalary(getSalary() + (getSalary() * bonus));
    }
}
