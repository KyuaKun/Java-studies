package Exercicio02;

public class Veiculo {
	private Boolean ligado = true;

	public Boolean getLigado() {
		return ligado;
	}

	public void ligar() {
		ligado = true;
	}

	public void desligar() {
		ligado = false;
	}
	
	public void estadoVeiculo() {
		System.out.println("Esta ligado? " + getLigado() + "\n");
	}
}
