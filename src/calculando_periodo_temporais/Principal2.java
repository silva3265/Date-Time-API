package calculando_periodo_temporais;

import java.time.LocalDate;
import java.time.Period;

public class Principal2 {

    public static void main(String[] args) {
        Period tempoMedioEntrega = Period.parse("P1M5D");
        LocalDate hoje = LocalDate.now();
        LocalDate dataPrevistaEntrega = hoje.plus(tempoMedioEntrega); /* pega a data e soma o periodo */

        System.out.println(hoje);
        System.out.println(dataPrevistaEntrega);
    }

}
