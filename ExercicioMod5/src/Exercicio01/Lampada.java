package Exercicio01;

public class Lampada {
	private boolean ligada = true;
	
	public boolean isLigada() {
		return ligada;
	}
	
	public Boolean ligar() {
		return ligada = true;
	}
	
	public Boolean desligar() {
		return ligada = false;
	}
	
	public void imprimir() {
		if(ligada) {
			System.out.println("Aparelho: ligado.");
		} else {
			System.out.println("Aparelho: desligado.");
		}
	}
}
