package Exercicio02;


public class Aplicacao {
	public static void main(String[] args) {
		
		Veiculo hondaCivicG10 = new Automovel();
		hondaCivicG10.desligar();
		System.out.println("Est� ligado?: "+ hondaCivicG10.getLigado() + "\n");
		hondaCivicG10.ligar();
		System.out.println("Est� ligado?: "+ hondaCivicG10.getLigado() + "\n");
		
		Veiculo xre600c = new Motocicleta();
		xre600c.desligar();
		System.out.println("Est� ligado?: "+ xre600c.getLigado() + "\n");
		xre600c.ligar();
		System.out.println("Est� ligado?: "+ xre600c.getLigado() + "\n");
		
		Veiculo mercedes = new Onibus();
		mercedes.desligar();
		System.out.println("Est� ligado?: "+ mercedes.getLigado() + "\n");
		mercedes.ligar();
		System.out.println("Est� ligado?: "+ mercedes.getLigado() + "\n");
	}
}
