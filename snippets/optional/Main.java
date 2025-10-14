package snippets.optional;

import java.util.List;

import snippets.optional.domain.Client;
import snippets.optional.service.ClientService;

/*
 * Conteúdo: Trabalhando com Optional
 * Caso de uso: Como utilizar a classe Optional para evitar null checks e melhorar a legibilidade do código
 * Data de criação: 13/10/2025
 */

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService(List.of(
                new Client(1, "Alice", 30),
                new Client(2, "Bob", 25),
                new Client(3, "Charlie", 35)));

        clientService.findById(2).ifPresentOrElse(
                client -> System.out.println("Cliente encontrado ...: " + client),
                () -> System.out.println("Cliente não encontrado"));

        // Usando orElseGet para fornecer um cliente padrão se não encontrado
        Client newClient = clientService.findByName("John").orElseGet(() -> new Client(4, "John", 22));
        System.out.println("Novo cliente ...: " + newClient);
    }
}
