package Exercicio02;


public class Aplicacao {
	public static void main(String[] args) {
		
		Veiculo hondaCivicG10 = new Automovel();
		hondaCivicG10.desligar();
		hondaCivicG10.estadoVeiculo();
		hondaCivicG10.ligar();
		hondaCivicG10.estadoVeiculo();
		
		Veiculo xre600c = new Motocicleta();
		xre600c.desligar();
		xre600c.estadoVeiculo();
		xre600c.ligar();
		xre600c.estadoVeiculo();
		
		Veiculo mercedes = new Onibus();
		mercedes.desligar();
		mercedes.estadoVeiculo();
		mercedes.ligar();
		mercedes.estadoVeiculo();
	}
}
