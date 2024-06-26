package localdate;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
//        LocalDate dataHoje = LocalDate.now(); /* Apenas a Data de agora */
//        System.out.println(dataHoje);

//        LocalDate dataNascimento = LocalDate.of(1981, 9, 13); /* passamos o ano, mes e o dia do mes */
//        System.out.println(dataNascimento);

        LocalDate diaDoProgramador = LocalDate.ofYearDay(2022, 256); /* Esse metodo vai saber a data do dia do programador */
        System.out.println(diaDoProgramador);
    }

}
