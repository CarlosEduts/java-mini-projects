package utility_classes.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * Conteúdo: Classes Utilitárias 
 * Caso de uso: Trabalhando com caminhos/diretórios, método relativize da classe Path
 * Data de criação: 30/09/2025
 */

public class RelativizeDemo {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/ubuntu-dev"); // Caminho absoluto
        Path file = Paths.get("/home/ubuntu-dev/java-mini-projects/files/file.txt"); // Caminho absoluto

        // Caminho relativo
        // Se eu estiver no diretório dir, qual o caminho para chegar no arquivo file
        Path pathToFile = dir.relativize(file);

        System.out.println("Caminho para chegar no arquivo ...: " + pathToFile);
    }
}
