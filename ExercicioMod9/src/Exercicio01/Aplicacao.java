package Exercicio01;

public class Aplicacao {
	public static void main(String[] args) {
	
		Produto produto1 = new Produto("Feijão", 2.5, 04, 10, 2020);
		System.out.println(String.format("ID: %05d | Nome: %s | Peso: %.1fkg | Data de Validade: %s", produto1.getID(), produto1.getNome(), produto1.getPeso(), produto1.getDataValidade()));
		
		Produto produto2 = new Produto("Café", 1.0, 01, 01, 2022);
		System.out.println(String.format("ID: %05d | Nome: %s | Peso: %.1fkg | Data de Validade: %s", produto2.getID(), produto2.getNome(), produto2.getPeso(), produto2.getDataValidade()));
		
		
		Produto produto3 = new Produto("Beterraba", 0.9, 12, 11, 2017);
		System.out.println(String.format("ID: %05d | Nome: %s | Peso: %.1fkg | Data de Validade: %s", produto3.getID(), produto3.getNome(), produto3.getPeso(), produto3.getDataValidade()));
		
	}
}
