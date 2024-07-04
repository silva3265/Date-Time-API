package MonthDay;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class Principal1 {

    public static void main(String[] args) {
//        MonthDay diaMes = MonthDay.now(); /* Vai chamar o dia do Mes */
//        MonthDay diaMes = MonthDay.of(Month.SEPTEMBER, 13); 
//        MonthDay diaMes = MonthDay.from(LocalDate.now());
        MonthDay diaMes = MonthDay.parse("--09-13");

        System.out.println(diaMes);

//        LocalDate dataAniversario = diaMes.atYear(2022);
        LocalDate dataAniversario = Year.now().atMonthDay(diaMes); /* vai puxar a data de aniversario do ano */
        System.out.println(dataAniversario);
    }

}
