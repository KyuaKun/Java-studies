package Exercicio02;

public class Automovel extends Veiculo {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("Ligando autom�vel.");
	}

	@Override
	public void desligar() {
		super.desligar();
		System.out.println("Desligando autom�vel.");
	}

	@Override
	public void estadoVeiculo() {
		super.estadoVeiculo();
	}
}
