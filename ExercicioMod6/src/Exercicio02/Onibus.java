package Exercicio02;

public class Onibus extends Veiculo  {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("�nibus ligado.");
	}

	@Override
	public void desligar() {
		super.desligar();
		System.out.println("�nibus desligado.");
	}

}
