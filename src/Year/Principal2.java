package Year;

import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Principal2 {

	/* Year - vamos utilizar apenas quando a gente for trabalhar apenas com ano */
    public static void main(String[] args) {
        Year ano = Year.parse("2023"); 
//        Year anoFuturo = ano.plus(Period.parse("P10Y")); /* vai calcular o ano futuro '2023 a 2033'*/
//        Year anoFuturo = ano.plus(10, ChronoUnit.CENTURIES); /* Vai retornar um ano futuro com 10 seculos na frente */
        Year anoFuturo = ano.plusYears(10); /* Vai somar os anos */

        System.out.println(ano);
        System.out.println(anoFuturo);
    }

}
