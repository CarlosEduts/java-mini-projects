package snippets.error_handling.try_catch_finally;

/*
 * Conteúdo: Tratamento de Erros e Exceções
 * Caso de uso: Blocos try, catch e finally
 * Data de criação: 17/09/2025
 */

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Resultado ...: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Erro ...: Divisão por zero!");
        } finally {
            System.out.println("O bloco 'finally' sempre é executado.");
        }
    }
}
