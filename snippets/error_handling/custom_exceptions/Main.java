package snippets.error_handling.custom_exceptions;

/*
 * Conteúdo: Tratamento de Erros e Exceções
 * Caso de uso: Criação e uso de exceções personalizadas
 * Data de criação: 17/09/2025
 */

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(100);

        try {
            myAccount.withdraw(250);
        } catch (InsufficientBalanceException e) {
            System.out.println("Erro ...: " + e.getMessage());
        }
    }
}
