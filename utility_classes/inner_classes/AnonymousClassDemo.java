package utility_classes.inner_classes;

/*
 * Conteúdo: Classes Utilitárias
 * Caso de uso: Trabalhando com classes anônimas, criando uma classe Animal e sobrescrevendo seu método makeSound usando uma classe anônima
 * Data de criação: 10/10/2025
 */

class Animal {
    void makeSound() {
        System.out.println("Som genérico");
    }
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Au Au");
            }
        };

        dog.makeSound();
    }
}
