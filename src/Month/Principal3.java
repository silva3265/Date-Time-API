package Month;

import java.time.Month;

public class Principal3 {

    public static void main(String[] args) {
        System.out.println(Month.DECEMBER.firstDayOfYear(true)); /* Vai pegar contagem de dias do ano  */
        System.out.println(Month.DECEMBER.firstDayOfYear(false));

        System.out.println(Month.FEBRUARY.length(true)); 
        System.out.println(Month.FEBRUARY.length(false));

        System.out.println(Month.FEBRUARY.firstMonthOfQuarter()); // vai pegar qual o primeiro mes do trimestre
        System.out.println(Month.SEPTEMBER.firstMonthOfQuarter());
    }

}
