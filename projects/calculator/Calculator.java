package projects.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double result = 0;

        System.out.println("Calculadora simples de dois números!");
        System.out.print("Primeiro número: ");
        double x = input.nextInt();

        System.out.print("Segundo número: ");
        double y = input.nextInt();
        input.nextLine();

        System.out.println("+--- Operações ---+");
        System.out.println("+ Soma\n- Subtração\n* Multiplicação\n/ Divisão");
        System.out.println("+--- --------- ---+");

        System.out.println("Operação: ");
        String op = input.nextLine();
        System.out.println(op);

        if (op.equals("+")) {
            result = x + y;
        } else if (op.equals("-")) {
            result = x - y;
        } else if (op.equals("*")) {
            result = x * y;
        } else if (op.equals("/")) {
            if (y != 0) {
                result = x / y;
            } else {
                System.out.println("Erro: divisão por zero.");
                input.close();
                return;
            }
        } else {
            System.out.println("Operação Inválida");
        }

        System.out.println("Resultado: " + result);
        input.close();
    }
}
