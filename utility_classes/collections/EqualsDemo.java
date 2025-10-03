package utility_classes.collections;

/*
 * Conteúdo: Classes Utilitárias 
 * Caso de uso: Trabalhando com coleções, comparação de objetos com o método equals()
 * Data de criação: 02/09/2025
 */

public class EqualsDemo {
    public static void main(String[] args) {
        /*
         * Regras do método equals():
         * - Reflexivo: x.equals(x) deve ser true para qualquer x não nulo
         * - Simétrico: x.equals(y) deve ser igual a y.equals(x)
         * - Transitivo: se x.equals(y) e y.equals(z) são true, então x.equals(z)
         * deve ser true
         * - Consistente: múltiplas chamadas de x.equals(y) devem retornar o
         * mesmo valor x.equals(null) deve ser false para qualquer x não nulo
         */
        String str1 = new String("Java");
        String str2 = new String("Java");

        // Comparação de referências (endereços de memória)
        System.out.println("str1 == str2: " + (str1 == str2)); // false

        // Comparação de valores (conteúdo)
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
    }
}
