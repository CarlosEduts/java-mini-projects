package snippets.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Conteúdo: Trabalhando com arquivos 
 * Caso de uso: Classe FileWriter
 * Data de criação: 28/09/2025
 */

public class FileWriterDemo {
    public static void main(String[] args) {
        File file = new File("./snippets/file/my_file.txt");

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("Olá, Mundo! \n");

            // Serve para garantir persistência imediata dos dados no arquivo, evitando
            // perdas caso o programa seja encerrado inesperadamente.
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
