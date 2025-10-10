package snippets.error_handling.multi_catch;

/*
 * Conteúdo: Tratamento de Erros e Exceções em Java
 * Caso de uso: Multi-catch
 * Data de criação: 19/09/2025
 */

public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[7];
            System.out.println(numbers[10]); // Erro ...: ArrayIndexOutOfBounds
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro ...: " + e.getMessage());
        }
    }
}
