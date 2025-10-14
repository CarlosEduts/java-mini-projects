package snippets.optional.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import snippets.optional.domain.Client;

public class ClientService {
    private List<Client> clients;

    public ClientService(List<Client> clients) {
        this.clients = clients;
    }

    public Optional<Client> findById(Integer id) {
        return findBy(client -> client.getId().equals(id));
    }

    public Optional<Client> findByName(String name) {
        return findBy(client -> client.getName().equals(name));
    }

    // Método genérico para buscar clientes com base em um predicado
    private Optional<Client> findBy(Predicate<Client> predicate) {
        Client found = null;
        for (Client client : clients) {
            if (predicate.test(client)) {
                found = client;
            }
        }
        return Optional.ofNullable(found);
    }
}
