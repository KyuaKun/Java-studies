package Exercicio02;

public class Automovel extends Veiculo {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("Autom�vel ligado.");
	}

	@Override
	public void desligar() {
		super.desligar();
		System.out.println("Autom�vel desligado.");
	}

	
	
}
