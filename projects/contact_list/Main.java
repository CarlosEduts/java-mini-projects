package projects.contact_list;

import java.util.ArrayList;
import java.util.Scanner;

/* 
 * Projeto: Lista de Contatos
 * Metas:
 *  - Aprender a usar ArrayList para armazenar múltiplos objetos.
 *  - Praticar estruturas de repetição para manipular listas.
 * Data de criação: 25/07/2025
*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        while (true) {
            System.out.println("\n+--- Lista de Contatos ---+");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Ver Lista de contatos");
            System.out.println("0 - Sair");
            System.out.println("+--- ----------------- ---+");

            System.out.print("Número da ação: ");
            int action = input.nextInt();
            input.nextLine();

            if (action == 1) {
                System.out.print("Digite o nome do contato: ");
                String name = input.nextLine();

                System.out.print("Digite o número do contato: ");
                String phone = input.nextLine();

                Contact contact = new Contact(name, phone);
                contacts.add(contact);
            } else if (action == 2) {
                System.out.println("\n+--- Lista de Contatos ---+");

                for (Contact contact : contacts) {
                    System.out.println(contact.toString());
                }
            } else {
                break;
            }
        }
        input.close();
    }
}
