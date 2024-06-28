package adicionando_subtraindo_datas;

import java.time.LocalDate;

public class Principal3 {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate dataProximaParcela = hoje.plusDays(30); /* vai adicionar daqui a 30 dias, vai somar 30 dias  */

        System.out.println(hoje);
        System.out.println(dataProximaParcela);
    }

}
