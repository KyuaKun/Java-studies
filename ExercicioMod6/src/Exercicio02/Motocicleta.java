package Exercicio02;

public class Motocicleta extends Veiculo  {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("Motocicleta ligado.");
	}

	@Override
	public void desligar() {
		super.desligar();
		System.out.println("Motocicleta desligado.");
	}

}
