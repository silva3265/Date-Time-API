package duration;

import java.time.Duration;

public class Principal {
	
	/* Quando vai usar Duration? R: quando quiser representar a duração de alguma coisa baseada em horas */

    public static void main(String[] args) {
//        Duration duracao = Duration.ofHours(5); /* Periodo de tempo de 5 horas */
//        Duration duracao = Duration.ofDays(2); /* Ele converte em Horas '2 é 48 horas'*/
//        Duration duracao = Duration.parse("PT5H"); /* parse converte a String em ISO */
        Duration duracao = Duration.parse("P1DT5H"); /* 1 dia e 5 horas */
        System.out.println(duracao);

//        Duration duracaoCalculada = duracao.plus(Duration.ofMinutes(30)); /* vai adcionar mais 30 min num objeto ja calculado */
//        Duration duracaoCalculada = duracao.plusMinutes(10); /* Resultado é o mesmo do de cima */
//        Duration duracaoCalculada = duracao.multipliedBy(3); /* vai multiplicar o valor */
        Duration duracaoCalculada = duracao.dividedBy(2); /* Vai dividir a quantidade de horas po '2' */
        System.out.println(duracaoCalculada);

        System.out.println(duracaoCalculada.getSeconds()); /* vai converter pra segundos */

        System.out.println(duracaoCalculada.toMinutes()); /* vai converter pra minutos */
        System.out.println(duracaoCalculada.toHours()); /* Vai converter pra horas */

        System.out.println(duracaoCalculada.toMinutesPart()); /* Vai converter a parte dos minutos */
        System.out.println(duracaoCalculada.toHoursPart()); /* Vai converter a parte das horas */
    }

}
