package snippets.inner_classes;

/*
 * Conteúdo: Trabalhando com classes anônimas
 * Caso de uso: Criando uma classe Animal e sobrescrevendo seu método makeSound usando uma classe anônima
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
