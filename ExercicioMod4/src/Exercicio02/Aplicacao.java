package Exercicio02;

public class Aplicacao {
	public static void main(String[] args) {
		
		Fracao fracao1 = new Fracao(5,8);
		Fracao fracao2 = new Fracao(8,5);
		
		System.out.println(fracao1.toString());
		System.out.println(fracao2.toString());
		System.out.println("\n"+fracao1.fracaoCalcular(fracao2));
	}
}
