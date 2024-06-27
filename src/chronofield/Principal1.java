package chronofield;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Principal1 {

    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.parse("2023-10-04");
//        System.out.println(ChronoField.DAY_OF_MONTH.getFrom(dataVencimento)); /* vai pegar o dia do Mes na data passada */
//        System.out.println(ChronoField.HOUR_OF_DAY.getFrom(dataVencimento)); /* vai pegar a hora dia na data passada */
//        System.out.println(dataVencimento.getLong(ChronoField.DAY_OF_MONTH)); /* vai pegar o dia do Mes na data passada */
        
        /* forma mais curta */
        System.out.println(dataVencimento.getDayOfMonth()); 
        System.out.println(dataVencimento.getMonthValue());
        System.out.println(dataVencimento.getYear());
    }

}
