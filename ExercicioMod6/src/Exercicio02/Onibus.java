package Exercicio02;

public class Onibus extends Veiculo  {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("Ligando ônibus.");
	}

	@Override
	public void desligar() {
		super.desligar();
		System.out.println("Desligando ônibus.");
	}
	
	@Override
	public void estadoVeiculo() {
		super.estadoVeiculo();
	}
}
