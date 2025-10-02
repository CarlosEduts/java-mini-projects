package utility_classes.collections;

/*
 * Conteúdo: Classes Utilitárias 
 * Caso de uso: Trabalhando com coleções, classe Equals para comparação de objetos
 * Data de criação: 02/09/2025
 */

public class EqualsDemo {
    public static void main(String[] args) {
        String str1 = new String("Java");
        String str2 = new String("Java");

        // Comparação de referências (endereços de memória)
        System.out.println("str1 == str2: " + (str1 == str2)); // false

        // Comparação de valores (conteúdo)
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
    }
}
