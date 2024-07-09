package comparando_objetos_temporais;

import java.time.LocalDate;
import java.time.chrono.ThaiBuddhistDate;

public class Principal {

    public static void main(String[] args) {
        LocalDate hoje1 = LocalDate.now();
        LocalDate hoje2 = LocalDate.now();
        ThaiBuddhistDate hojeThai = ThaiBuddhistDate.now(); /* Data Budista */
        LocalDate depoisDeAmanha = hoje1.plusDays(2);

        System.out.println(hoje1.equals(hoje2));
        System.out.println(hoje1.isEqual(hojeThai)); // para fazer comparação de datas
        System.out.println(depoisDeAmanha.compareTo(hoje1) > 0);
        System.out.println(depoisDeAmanha.isAfter(hoje1)); // depois de amanha é hoje?
        System.out.println(depoisDeAmanha.isBefore(hoje1));
    }

}
