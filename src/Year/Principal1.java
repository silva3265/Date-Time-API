package Year;

import java.time.LocalDate;
import java.time.Year;

public class Principal1 {

    public static void main(String[] args) {
//        Year ano = Year.now(); /* Vai pegar o Ano atual */
//        Year ano = Year.of(2023); /* Vai pegar o ano passando no parametro */
//        Year ano = Year.from(LocalDate.now()); /* vai retornar qual é o ano desse LocalDate */
        Year ano = Year.parse("2024"); /* vai retornar o ano que passar no parametro */

        System.out.println(ano);
        System.out.println(ano.isLeap()); /* esse metodo vai descobrir se o ano do objeto é Bisexto */

        LocalDate diaDoProgramador = ano.atDay(256); /* vai retornar a data baseada no numero do dia passado */
        System.out.println(diaDoProgramador);
    }

}
