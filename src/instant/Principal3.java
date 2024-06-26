package instant;

import java.time.Instant;
import java.util.Date;

public class Principal3 {

    public static void main(String[] args) {
        Date data = new Date();
        Instant instante = data.toInstant(); // vai retornar um instante a partir da data

        System.out.println(data);
        System.out.println(instante);
    }

}
