package projects.conversor;

import java.util.Scanner;

/* 
 * Projeto: Conversor de Temperaturas
 * Meta: Crie um programa que permita converter: Celsius para Fahrenheit & Fahrenheit para Celsius
 * Data de criação: 24/07/2025
*/

public class Conversor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("+--- Conversor ---+");
        System.out.println("1 - Celsius → Fahrenheit \n2 - Fahrenheit → Celsius \n0 - Sair");
        System.out.println("+--- --------- ---+");

        System.out.print("Escolha: ");
        int type = input.nextInt();

        if (type == 1) {
            System.out.print("Valor em °C: ");
            double value = input.nextDouble();
            System.out.println(celsiusToFahrenheit(value));

        } else if (type == 2) {
            System.out.print("Valor em °F: ");
            double value = input.nextDouble();
            System.out.println(fahrenheitToCelsius(value));

        } else {
            System.out.println("Saindo...");
        }

        input.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
