package localdatetime;

import java.time.LocalDateTime;

public class Principal {

	public static void main(String[] args) {
//        LocalDateTime dataHora = LocalDateTime.now(); /* Va buscar a data e o horario atual */
		LocalDateTime dataHora = LocalDateTime.of(1981, 9, 13, 20, 55, 10); /* vai mostrar ano, data etc*/
		System.out.println(dataHora);
	}

}
