package localtime;

import java.time.LocalTime;

public class Principal {

    public static void main(String[] args) {
//        LocalTime horario = LocalTime.now(); /* Vai mostrar a hora atual */
        LocalTime horario = LocalTime.of(23, 54, 10); /* Vai buscar um Horario especifico */
        System.out.println(horario);
    }

}
