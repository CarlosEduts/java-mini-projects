package snippets.error_handling.try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Conteúdo: Tratamento de Erros e Exceções
 * Caso de uso: Try-with-resources, facilita o fechamento automático de recursos (Closeable ou AutoCloseable)
 * Data de criação: 19/09/2025
 */

public class Main {
    public static void main(String[] args) {
        // Nesse caso dará o erro de arquivo inexistente (No such file or directory)
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo ...: " + e.getMessage());
        }
    }
}
