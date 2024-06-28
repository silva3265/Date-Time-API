package chronounit;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Principal1 {

    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        
//        LocalDate dataproximaParcela = agora.plus(30, ChronoUnit.DAYS); // pega a data e coma com 30 dias
        LocalDate dataproximaParcela   = ChronoUnit.DAYS.addTo(agora, 30);
        
        System.out.println(agora);
        System.out.println(dataproximaParcela);
       
    }

}