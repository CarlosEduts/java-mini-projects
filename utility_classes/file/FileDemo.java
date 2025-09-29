package utility_classes.file;

import java.io.File;
import java.io.IOException;

/*
 * Conteúdo: Classes Utilitárias 
 * Caso de uso: Trabalhando com arquivos, classe File
 * Data de criação: 28/09/2025
 */

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("./files/file.txt");

        // Criar o arquivo, e imprimir informações sobre sua criação
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(
                    isCreated ? "Arquivo criado com sucesso!"
                            : file.exists()
                                    ? "Não foi possível criar o arquivo, Arquivo já existente."
                                    : "");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Resgatar caminho onde o arquivo foi criado
        System.out.println("Caminho local ...: " + file.getPath());
        System.out.println("Caminho absoluto ...: " + file.getAbsolutePath());

        // Resgatar informação sobre o arquivo
        System.out.println("É um diretório? " + file.isDirectory());
        System.out.println("É um arquivo? " + file.isFile());
        System.out.println("Esta oculto? " + file.isHidden());
        System.out.println("Ultima modificação ...: " + file.lastModified()); // Retorna valor em milissegundos

    }
}
