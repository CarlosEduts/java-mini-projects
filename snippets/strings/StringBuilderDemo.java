package snippets.strings;

/*
 * Conteúdo: Manipulação de Strings
 * Caso de uso: Classe StringBuilder para manipulação de strings
 * Data de criação: 22/09/2025
 */

public class StringBuilderDemo {
    public static void main(String[] args) {
        // A classe String em Java é imutável: sempre que você modifica uma String, na
        // prática é criado um novo objeto na memória.Isso pode ser ineficiente quando
        // você precisa fazer muitas concatenações ou alterações.

        // Diferente de String, o StringBuilder permite modificar o conteúdo sem criar
        // novos objetos a cada alteração. É mais eficiente para operações como:
        // concatenar (append), inserir (insert), substituir (replace), deletar (delete)
        // e inverter (reverse)

        StringBuilder sb = new StringBuilder("Olá");

        // Métodos
        System.out.println(sb.append(" Carlos"));
        System.out.println(sb.replace(4, 10, "Mundo"));
        System.out.println(sb.reverse());
        sb.reverse(); // Apenas para voltar a string ao normal
        System.out.println(sb.delete(0, 4));
    }
}
