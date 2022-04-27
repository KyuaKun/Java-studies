package UsandoLocalDate;

import java.time.LocalDate;
import java.time.Period;

public class Aplicacao {
	public static void main(String[] args) {
		
		LocalDate dataHoje = LocalDate.now().minusDays(0);
		System.out.println("Data: " + dataHoje);
		System.out.println("Dia da semana: " + dataHoje.getDayOfWeek().name());
		System.out.println("Dia da semana: " + dataHoje.getDayOfWeek().getValue());
		System.out.println("Mês: " + dataHoje.getMonthValue());
		System.out.println("Mês: " + dataHoje.getMonth().name());
		System.out.println("Ano: " + dataHoje.getYear());
		
		LocalDate aniversario = LocalDate.of(1997, 04, 23);
		
		Period periodoEntre = Period.between(aniversario, dataHoje);
		System.out.println(periodoEntre);
		System.out.println(periodoEntre.getYears());
		
	}
}
