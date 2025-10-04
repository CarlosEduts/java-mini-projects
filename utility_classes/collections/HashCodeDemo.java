package utility_classes.collections;

/*
 * Conteúdo: Classes Utilitárias 
 * Caso de uso: Trabalhando com coleções, método hashCode()
 * Data de criação: 04/09/2025
 */

public class HashCodeDemo {
    public static void main(String[] args) {
        String technology01 = "Java";
        String technology02 = "Java";

        // Sempre que dois objetos forem iguais, o hashCode() deles também serão iguais.
        // Porém, o contrário não é verdadeiro. Dois objetos podem ter o
        // mesmo hashCode() e serem diferentes.
        System.out.println("São iguais? " + technology01.equals(technology02));

        System.out.println("Technology01 hashCode ...: " + technology01.hashCode());
        System.out.println("Technology02 hashCode ...: " + technology02.hashCode());
    }
}
