package TemporalAdjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Principal1 {

	public static void main(String[] args) {
		LocalDate dataHoje = LocalDate.now();
		System.out.println(dataHoje);

		LocalDate primeiraSegundaProximoMes = dataHoje.plusMonths(1)
				.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); // Primeira data do mes que seja segunda feira
		System.out.println(primeiraSegundaProximoMes);

		LocalDate dataUltimoDiaDomes = dataHoje.with(TemporalAdjusters.lastDayOfMonth()); /* vai imprimir a data do ultimo dia do mes */
		System.out.println(dataUltimoDiaDomes);

		LocalDate dataProximaSextaFeira = dataHoje.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)); /* Vai pegara  proxima sexta feira depois da data de hoje */
		System.out.println(dataProximaSextaFeira);
	}

}
