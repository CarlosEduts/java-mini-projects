package utility_classes.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * Conteúdo: Classes Utilitárias 
 * Caso de uso: Trabalhando com arquivos, classe BufferedReader
 * Data de criação: 29/09/2025
 */

public class BufferedReaderDemo {
    public static void main(String[] args) {
        File file = new File("./files/file.txt");

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
