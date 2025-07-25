package projects.person_register;

public class Person {
    private String name;
    private String email;
    private int age;

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \nE-mail: %s \nIdade: %d", this.name, this.email, this.age);
    }
}
