package formatando_data_hora_novaApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Principal {

	public static void main(String[] args) {
		LocalDateTime dataHora = LocalDateTime.now();
//        DateTimeFormatter formatador = DateTimeFormatter.ISO_DATE; /* Vai trazer só a Data */

//        DateTimeFormatter formatador = DateTimeFormatter
//                .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
//                .withLocale(new Locale("pt", "BR"));

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm:ss"); /* ofPattern - passamos um padrão de letras */

//        System.out.println(dataHora);
//        System.out.println(formatador.format(dataHora));
		System.out.println(dataHora.format(formatador));
	}

}
