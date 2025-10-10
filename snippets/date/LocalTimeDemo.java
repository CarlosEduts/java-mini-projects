package snippets.date;

import java.time.LocalTime;

/*
 * Conteúdo: Trabalhando com datas 
 * Caso de uso: Método moderno para trabalhar com tempo no Java
 * Data de criação: 23/09/2025
 */

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        System.out.println(time); // Retorna a hora completa
        // retorna "hora:minuto:segundo"
        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
    }
}
