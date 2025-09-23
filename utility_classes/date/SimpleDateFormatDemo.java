package utility_classes.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Conteúdo: Classes Utilitárias 
 * Caso de uso: Trabalhando com datas, formatando datas com o SimpleDateFormat
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
