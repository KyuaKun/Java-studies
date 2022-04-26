package Exercicio01;

public class Aplicacao {
	public static void main(String[] args) {
		Relogio relogio01 = new Relogio();
		
		relogio01.acertarRelogio(23, 25, 19);
		
		System.out.println("Ponteiro hora: "+ relogio01.lerHora());
		System.out.println("Ponteiro minuto: "+ relogio01.lerMinuto());
		System.out.println("Ponteiro segundo: "+ relogio01.lerSegundo());
		
		Relogio relogio02 = new Relogio();
		
		relogio02.acertarRelogio(13, 55, 49);
	}
}
