package outras_formas_instancias;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Principal2 {

    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();
//        LocalDate data = dataHora.toLocalDate(); // vai extrair só a parte da data
        LocalDate data = LocalDate.from(dataHora); // 
        System.out.println(data);

//        LocalTime hora = dataHora.toLocalTime();
        LocalTime hora = LocalTime.from(dataHora); // vai extrair só a parte da hora
        System.out.println(hora);
    }

}
