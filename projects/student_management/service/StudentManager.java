package projects.student_management.service;

import java.util.ArrayList;

import projects.student_management.model.Student;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(String name, String email, int age) {
        for (Student student : students) {
            if (student.getEmail().equals(email)) {
                System.out.println("E-mail já cadastrado.");
                return;
            }
        }

        Student student = new Student(name, email, age);
        students.add(student);
        System.out.println("Estudante adicionado com sucesso!");
    }

    public void listStudents() {
        int i = 0;
        for (Student student : students) {
            System.out.println(i + " - " + student.toString());
        }
    }

    public void findStudentByEmail(String email) {
        for (Student student : students) {
            if (student.getEmail().equals(email)) {
                System.out.println(student.toString());
            }
        }
    }

    public void findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student.toString());
            }
        }
    }

    public void updateStudent(String name, String email, int age) {
        for (Student student : students) {
            if (student.getEmail().equals(email)) {
                student.setName(name);
                student.setAge(age);
                student.setEmail(email);

                System.out.println(student.toString());
            }
        }
    }

    public void removeStudent(int index) {
        if (index >= 0 && index < students.size()) {
            this.students.remove(index);
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
