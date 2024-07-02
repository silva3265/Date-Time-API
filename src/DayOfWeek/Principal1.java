package DayOfWeek;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Principal1 {

    public static void main(String[] args) {
//        DayOfWeek diaDaSemana = DayOfWeek.MONDAY; /* Vai imprimir o dia da semana */
//        DayOfWeek diaDaSemana = DayOfWeek.of(1); /* Vai imprimir o numero do dia da Semana, numero 1 - 'Domingo'  */
//        DayOfWeek diaDaSemana = DayOfWeek.from(LocalDate.now()); /* Vai obter um dia da semana a partir de uma Data */
        DayOfWeek diaDaSemana = LocalDate.now().getDayOfWeek(); /* getDayOfWeek() - vai retornar uma instancia do dia da semana */

        System.out.println(diaDaSemana);

//        System.out.println(diaDaSemana.getDisplayName(
//                TextStyle.FULL, new Locale("pt", "BR"))); /* Esse metodo vai retornar o dia da semana, o nome 'quinta-feira'*/

        System.out.println(DateTimeFormatter.ofPattern("EEEE")
                .withLocale(new Locale("pt", "BR"))
                .format(diaDaSemana));
    }

}
