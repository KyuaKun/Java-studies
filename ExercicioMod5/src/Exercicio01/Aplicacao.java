package Exercicio01;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Lampada lampiao = new Lampada();
		lampiao.imprimir();
		
		lampiao.desligar();
		lampiao.imprimir();
		
		lampiao.ligar();
		lampiao.imprimir();
	}

}
