package ZoneId_ZoneOffset;

import java.time.ZoneId;

public class Principal1 {

    public static void main(String[] args) {
        ZoneId zona1 = ZoneId.systemDefault(); /* vai pegar o fusu horario padrão do Sistema Operacional */
        System.out.println(zona1);
        System.out.println(zona1.getClass()); /* Vai retornar a Classe dessa zona */

        ZoneId zona2 = ZoneId.of("America/Los_Angeles");
        System.out.println(zona2);
        System.out.println(zona2.getClass());

        System.out.println("---"); 

        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneId);
        }
    }

}
