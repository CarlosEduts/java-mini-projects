package snippets.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/*
 * Conteúdo: Trabalhando com caminhos/diretórios
 * Caso de uso: Classe SimpleFileVisitor para resgatar o conteúdo de um diretório recursivamente
 * Data de criação: 01/09/2025
 */

class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println("File name: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        System.out.println("\nDirectory: " + dir);
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorDemo {
    public static void main(String[] args) {
        Path dir = Path.of("error_handling"); // Diretório atual

        try {
            Files.walkFileTree(dir, new ListAllFiles());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
