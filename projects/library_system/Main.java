package projects.library_system;

/* 
 * Projeto: Sistema de Biblioteca
 * Objetivos:
 *  - Entender e aplicar herança entre classes.
 *  - Usar polimorfismo com sobrescrita de métodos.
 *  - Criar uma hierarquia simples entre classes com comportamentos diferentes.
 * Data de criação: 27/07/2025
*/

public class Main {
    public static void main(String[] args) {
        LibraryItem book = new Book("1984", 1949, "George Orwell");
        LibraryItem magazine = new Magazine("National Geographic", 2023, 220);

        System.out.println(book);
        System.out.println(magazine);

        book.borrow();
        magazine.borrow();

        book.returnItem();
        magazine.returnItem();
    }
}
