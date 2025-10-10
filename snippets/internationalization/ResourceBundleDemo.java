package snippets.internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

/*
 * Conteúdo: Trabalhando com internacionalização
 * Caso de uso: Uso da classe ResourceBundle para gerenciar a tradução de textos
 * Data de criação: 25/09/2025
 */

public class ResourceBundleDemo {
    public static void main(String[] args) {
        String path = "messages.message";

        ResourceBundle bundle = ResourceBundle.getBundle(path, Locale.forLanguageTag("en-US"));
        System.out.println(bundle.getString("hello.world"));

        bundle = ResourceBundle.getBundle(path, Locale.forLanguageTag("pt-BR"));
        System.out.println(bundle.getString("hello.world"));
    }
}
