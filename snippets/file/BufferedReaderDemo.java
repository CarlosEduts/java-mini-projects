package snippets.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * Conteúdo: Trabalhando com arquivos 
 * Caso de uso: Classe BufferedReader
 * Data de criação: 29/09/2025
 */

public class BufferedReaderDemo {
    public static void main(String[] args) {
        File file = new File("./snippets/file/my_file.txt");

        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
