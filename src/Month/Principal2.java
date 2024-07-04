package Month;

import java.time.LocalDate;
import java.time.Month;

public class Principal2 {

    public static void main(String[] args) {
        Month mesAtual = LocalDate.now().getMonth();
        Month mesCalculado = mesAtual.plus(10); /* de acordo com o numero ele vai buscar o mes daqui a 10 meses a partir do atual */

        System.out.println(mesAtual);
        System.out.println(mesCalculado);
    }

}
