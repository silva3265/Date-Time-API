package DayOfWeek;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Principal2 {

	/* DayOfWeek - só vamos usar ele quando formos representar algum dia da semana, E: verificar quais os dias que um estabelecimento esta fechado */
    public static void main(String[] args) {
        DayOfWeek diaDaSemanaHoje = LocalDate.now().getDayOfWeek(); /* vai pegar o dia da semana de hoje */
        DayOfWeek diaDaSemanaQuinzeDias = diaDaSemanaHoje.plus(15); /* vai pegar o dia da semana daqui há 15 dias */

        System.out.println(diaDaSemanaHoje);
        System.out.println(diaDaSemanaQuinzeDias);
    }

}
