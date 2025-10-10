package snippets.error_handling.multiple_exceptions;

/*
 * Conteúdo: Tratamento de Erros e Exceções em Java
 * Caso de uso: Captura múltipla de exceções
 * Data de criação: 17/09/2025
 */

public class Main {
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Erro ...: Objeto nulo.");
        } catch (Exception e) {
            System.out.println("Erro Genérico ...: " + e.getMessage());
        }
    }
}
