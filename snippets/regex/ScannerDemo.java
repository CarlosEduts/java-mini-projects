package snippets.regex;

import java.util.Scanner;

/*
 * Conteúdo: Trabalhando com expressões regulares 'REGEX' 
 * Caso de uso: Classe Scanner para trabalhar com strings e seleção
 * Data de criação: 28/09/2025
 */

public class ScannerDemo {
    public static void main(String[] args) {
        String technologies = "Java, 1995, Spring Boot, 2014, TypeScript, 2012, C#, 2000, NodeJs, 2009";
        Scanner scanner = new Scanner(technologies);

        scanner.useDelimiter(", ");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                System.out.println(", ano de Lançamento ...: " + scanner.nextInt());
            } else {
                System.out.print("Tecnologia ...: " + scanner.next());
            }
        }

        scanner.close();
    }
}
