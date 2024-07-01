package period;

import java.time.Period;

public class Principal {

	public static void main(String[] args) {
//        Period periodo = Period.ofDays(45); /* Periodo de 45 dias */
//        Period periodo = Period.ofMonths(1); /* Periodo de 1 mes */
//        Period periodo = Period.of(1, 5, 10);
		Period periodo = Period.parse("P2Y5M10D"); /* Passamos uma sequencia de caracteres, é apenas um periodo de tempo  */
		System.out.println(periodo);

//        Period periodoCalculado = periodo.plus(Period.ofYears(10)); /* Vai ser esse periodo + 10 anos */
//        Period periodoCalculado = periodo.plusYears(10);  
		Period periodoCalculado = periodo.multipliedBy(3).normalized(); /* Vai multiplicar esse periodo por 3  */
 
		System.out.println(periodoCalculado);

		String periodoFormatado = String.format("%d anos, %d meses e %d dias", periodoCalculado.getYears(),
				periodoCalculado.getMonths(), periodoCalculado.getDays());
		System.out.println(periodoFormatado);
	}

}
