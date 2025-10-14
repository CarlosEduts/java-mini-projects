package snippets.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * Conteúdo: Trabalhando com caminhos/diretórios 
 * Caso de uso: Método relativize da classe Path
 * Data de criação: 30/09/2025
 */

public class RelativizeDemo {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/ubuntu-dev"); // Caminho absoluto
        Path file = Paths.get("/home/ubuntu-dev/java-mini-projects/files/file.txt"); // Caminho absoluto

        // Se eu estiver no diretório dir, qual o caminho para chegar no arquivo file
        Path pathToFile = dir.relativize(file);
        System.out.println("Caminho para chegar no arquivo ...: " + pathToFile);
    }
}
