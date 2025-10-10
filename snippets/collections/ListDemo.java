package snippets.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Conteúdo: Trabalhando com coleções
 * Caso de uso: Exemplo de uso da interface List e da classe ArrayList
 * Data de criação: 06/10/2025
 */

public class ListDemo {
    public static void main(String[] args) {
        // Exemplo de uso da interface List e da classe ArrayList
        List<String> names = new ArrayList<>();

        names.add("Lucas");
        names.add("Simão");
        names.add("Pedro");
        System.out.println("Nomes ...: " + names);

        Collections.sort(names);
        System.out.println("Nomes ordenados ...: " + names);

        names.remove("Lucas");
        System.out.println("Nomes após remoção ...: " + names);

        System.out.println("Tamanho da lista de nomes ...: " + names.size());
    }
}
