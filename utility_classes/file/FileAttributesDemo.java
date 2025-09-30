package utility_classes.file;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/*
 * Conteúdo: Classes Utilitárias 
 * Caso de uso: Trabalhando com arquivos, modificadores e atributos de arquivos
 * Data de criação: 30/09/2025
 */

public class FileAttributesDemo {
    public static void main(String[] args) {
        File file = new File("files/file.txt");
        LocalDateTime now = LocalDateTime.now();

        try {
            file.createNewFile();

            // Modificar a data de modificação do arquivo em 5 dias atrás
            file.setLastModified(now.minusDays(5).toInstant(ZoneOffset.UTC).toEpochMilli());

            System.out.println("Momento atual ...: " + now.toInstant(ZoneOffset.UTC).toEpochMilli());
            System.out.println("Ultima modificação do arquivo menos ...: " + file.lastModified());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
