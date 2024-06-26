package instant;

import java.time.Instant;

public class Principal1 {

    public static void main(String[] args) {
        Instant instante = Instant.now(); /* me de o instante agora, (now() - agora ) */
        System.out.println(instante);

//        System.out.println(instante.getEpochSecond());
//        System.out.println(instante.getNano());

        System.out.println(instante.toEpochMilli()); /* vai retornar o tanto de milesegundos */
        System.out.println(System.currentTimeMillis()); /* numeros de milisegundos desde 1970*/
    }
 
}
