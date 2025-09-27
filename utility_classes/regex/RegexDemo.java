package utility_classes.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Conteúdo: Classes Utilitárias 
 * Caso de uso: Trabalhando com expressões regulares 'REGEX'
 * Data de criação: 27/09/2025
 */

public class RegexDemo {
    public static void main(String[] args) {
        // 1️⃣ ==> Procurar caracteres em um texto
        String charsRegex = "elit";
        String loremText = "Do Ut esse lorem anim ut dolor reprehenderit adipiscing fugiat elit eiusmod elit consectetur dolor.";

        Pattern pattern = Pattern.compile(charsRegex);
        Matcher matcher = pattern.matcher(loremText);

        System.out.println("Texto ...: " + loremText);
        System.out.print("Indices onde os caracteres '" + charsRegex + "' foram encontrados ...: ");

        // Inicia a busca em loop
        while (matcher.find()) {
            System.out.print(matcher.start() + " (" + matcher.group() + "), ");
        }
        System.out.println("\n"); // Apenas para quebrar a linha

        // 2️⃣ ==> Validar e-mail
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        String validEmail = "Carlos.edu@example.com";
        String invalidEmail = "Carlos@example";

        System.out.println("E-mail valido? ...: " + (emailPattern.matcher(validEmail).matches() ? "Sim" : "Não"));
        System.out.println("E-mail valido? ...: " + (emailPattern.matcher(invalidEmail).matches() ? "Sim" : "Não"));
        System.out.println("\n"); // Apenas para quebrar a linha
    }
}
