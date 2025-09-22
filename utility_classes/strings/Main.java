package utility_classes.strings;

/*
 * Conteúdo: Classes Utilitárias
 * Caso de uso: Manipulação de Strings
 * Data de criação: 20/09/2025
 */

public class Main {
    public static void main(String[] args) {
        String name = "Carlos";

        // Buscar caractere por índice
        System.out.println(name.charAt(0));

        // Tamanho de uma string
        System.out.println(name.length());

        // Comparar valor de stings
        System.out.println(name.equals("Carlos"));

        // Realizar troca caracteres
        System.out.println(name.replace("C", "M").replace("l", "c"));

        // Caixa alta e Caixa baixa
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Cortar strings (inclusivo, não inclusivo)
        System.out.println(name.substring(0, 4));

        // Remover caracteres de espaço do inicio e fim de uma string
        String nameWithSpaces = "     Carlos    ";
        System.out.println(nameWithSpaces.trim());

        /*
         * Usando o 'StringBuilder'
         * A classe String em Java é imutável: sempre que você modifica uma String, na
         * prática é criado um novo objeto na memória. Isso pode ser ineficiente quando
         * você precisa fazer muitas concatenações ou alterações.
         * 
         * Diferente de String, o StringBuilder permite modificar o conteúdo sem criar
         * novos objetos a cada alteração.
         * É mais eficiente para operações como: concatenar (append), inserir (insert),
         * substituir (replace), deletar (delete) e inverter (reverse)
         */

        StringBuilder sb = new StringBuilder("Olá");

        // Métodos
        System.out.println(sb.append(" Carlos"));
        System.out.println(sb.replace(4, 10, "Mundo"));
        System.out.println(sb.reverse());
        sb.reverse(); // Apenas para voltar a string ao normal
        System.out.println(sb.delete(0, 4));
    }
}
