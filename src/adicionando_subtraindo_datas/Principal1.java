package adicionando_subtraindo_datas;

import java.time.LocalDate;

public class Principal1 {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate semanaPassada = hoje.minusWeeks(1); /* Esse metodo vai subtrair as semanas que queremos subtrair */

        System.out.println(hoje);
        System.out.println(semanaPassada);
    }

}
