package Exercicio02;

public class Motocicleta extends Veiculo  {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("Ligando motocicleta.");
	}

	@Override
	public void desligar() {
		super.desligar();
		System.out.println("Desligando motocicleta.");
	}
	
	@Override
	public void estadoVeiculo() {
		super.estadoVeiculo();
	}
}
