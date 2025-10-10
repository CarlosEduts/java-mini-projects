package snippets.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/*
 * Conteúdo: Trabalhando com arquivos 
 * Caso de uso: Resgatando atributos de um arquivo
 * Data de criação: 30/09/2025
 */

public class FileAttributesDemo {
    public static void main(String[] args) {
        Path filePath = Paths.get("./snippets/file/my_file.txt");
        File file = filePath.toFile();
        LocalDateTime now = LocalDateTime.now();

        try {
            file.createNewFile();

            // Altera a data de modificação do arquivo em 5 dias atrás
            file.setLastModified(now.minusDays(5).toInstant(ZoneOffset.UTC).toEpochMilli());

            // Resgata informações sobre o arquivo
            BasicFileAttributes fileAttributes = Files.readAttributes(filePath, BasicFileAttributes.class);

            System.out.println("Criado em (Horário UTC) ...: " + fileAttributes.creationTime());
            System.out.println("Ultima modificação (Horário UTC) ...: " + fileAttributes.lastModifiedTime());
            System.out.println("Ultimo acesso (Horário UTC) ...: " + fileAttributes.lastAccessTime());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
