package utility_classes.strings;

/*
 * Conteúdo: Classes Utilitárias
 * Caso de uso: Manipulação de Strings
 * Data de criação: 20/09/2025
 */

public class StringMethodsDemo {
    public static void main(String[] args) {
        String name = "Carlos";

        // Buscar caractere por índice
        System.out.println(name.charAt(0));

        // Tamanho de uma string
        System.out.println(name.length());

        // Comparar valor de stings
        System.out.println(name.equals("Carlos"));

        // Realizar troca caracteres
        System.out.println(name.replace("C", "M").replace("l", "c"));

        // Caixa alta e Caixa baixa
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Cortar strings (inclusivo, não inclusivo)
        System.out.println(name.substring(0, 4));

        // Remover caracteres de espaço do inicio e fim de uma string
        String nameWithSpaces = "     Carlos    ";
        System.out.println(nameWithSpaces.trim());
    }
}
