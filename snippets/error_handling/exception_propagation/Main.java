package snippets.error_handling.exception_propagation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Conteúdo: Tratamento de Erros e Exceções
 * Caso de uso: Propagação de exceções com throws
 * Data de criação: 17/09/2025
 */

public class Main {
    // Se um método não trata uma exceção, ele pode propagá-la com throws
    public static void readFile(String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        System.out.println(br.readLine());

        br.close();
    }

    public static void main(String[] args) {
        try {
            readFile("file.txt");
        } catch (Exception e) {
            // Nesse caso dará o erro de arquivo inexistente (No such file or directory)
            System.out.println("Falha ao ler arquivo ...: " + e.getMessage());
        }
    }
}
