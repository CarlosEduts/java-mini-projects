package snippets.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Conteúdo: Trabalhando com datas
 * Caso de uso: Utilizando a classe SimpleDateFormat para formatar datas
 * Data de criação: 23/09/2025
 */

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        String patternBr = "dd/MM/yyyy HH:mm:ss"; // formato usado no Brasil
        String patternIt = "dd.MM.yyyy HH:mm:ss"; // formato usado na Itália
        String patternJp = "yyyy/MM/dd HH:mm:ss"; // formato usado no Japão

        Date date = new Date();

        System.out.println(new SimpleDateFormat(patternBr).format(date));
        System.out.println(new SimpleDateFormat(patternIt).format(date));
        System.out.println(new SimpleDateFormat(patternJp).format(date));
    }
}
