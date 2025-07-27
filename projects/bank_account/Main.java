package projects.bank_account;

import java.util.Scanner;

/* 
 * Projeto: Conta Bancária
 * Objetivos:
 *  - Aplicar encapsulamento usando private, getters, setters.
 *  - Implementar regras de negócio dentro da classe, protegendo seus dados.
 *  - Praticar métodos com validações e condições.
 * Data de criação: 27/07/2025
*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menu inicial para cadastro de conta
        System.out.println("+--- Cadastro de Conta ---+");
        System.out.print("Nome: ");
        String name = input.nextLine();

        System.out.print("Saldo inicial: ");
        double initialBalance = input.nextDouble();
        System.out.println("+--- ----------------- ---+");

        BankAccount bankAccount = new BankAccount(name, initialBalance);

        while (true) {
            // Menu de ações
            System.out.println("\n+--- Conta Bancaria ---+");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("0 - Sair");
            System.out.println("+--- -------------- ---+");

            System.out.print("O que você deseja fazer: ");
            int action = input.nextInt();

            if (action == 1) {
                System.out.print("Valor a depositar: ");
                double value = input.nextDouble();

                System.out.println(bankAccount.deposit(value));
            } else if (action == 2) {
                System.out.print("Valor a sacar: ");
                double value = input.nextDouble();

                System.out.println(bankAccount.withdraw(value));
            } else if (action == 3) {
                System.out.println("Saldo atual: " + bankAccount.getBalance());
            } else {
                System.out.println("Saindo...");
                break;
            }
        }
        input.close();
    }
}
