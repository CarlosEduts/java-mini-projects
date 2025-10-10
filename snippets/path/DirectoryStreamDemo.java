package snippets.path;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

/*
 * Conteúdo: Trabalhando com caminhos/diretórios
 * Caso de uso: Classe DirectoryStream para resgatar o conteúdo de um diretório
 * Data de criação: 01/09/2025
 */

public class DirectoryStreamDemo {
    public static void main(String[] args) {
        Path dir = Path.of("."); // Diretório atual

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path path : stream) {
                System.out.println("Pasta/Arquivo ...: " + path.toAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
