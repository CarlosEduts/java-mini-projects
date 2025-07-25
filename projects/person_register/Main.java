package projects.person_register;

import java.util.Scanner;

/* 
 * Projeto: Cadastro de Pessoa
 * Metas:
 *  - Criar sua primeira classe Java com atributos e métodos.
 *  - Instanciar objetos e trabalhar com dados encapsulados em uma entidade.
 * Data de criação: 24/07/2025
*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("+--- Cadastro de Pessoas ---+");
        System.out.print("Nome: ");
        String name = input.nextLine();

        System.out.print("E-mail: ");
        String email = input.nextLine();

        System.out.print("Idade: ");
        int age = input.nextInt();
        System.out.println("+--- ------------------- ---+");

        Person person = new Person(name, email, age);
        System.out.println(person.toString());

        input.close();
    }
}
