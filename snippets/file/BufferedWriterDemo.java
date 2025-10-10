package snippets.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Conteúdo: Trabalhando com arquivos
 * Caso de uso: Classe BufferedWriter
 * Data de criação: 29/09/2025
 */

public class BufferedWriterDemo {
    public static void main(String[] args) {
        File file = new File("./snippets/file/my_file.txt");

        try (
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("Olá, Mundo!");
            bufferedWriter.newLine();

            // Serve para garantir persistência imediata dos dados no arquivo, evitando
            // perdas caso o programa seja encerrado inesperadamente.
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
