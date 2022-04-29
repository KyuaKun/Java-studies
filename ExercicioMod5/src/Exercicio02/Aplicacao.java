package Exercicio02;

public class Aplicacao {
	
	public static void main(String[] args) {
		Data d1 = new Data(23, 04, 1997, 24, 13, 10);
		d1.imprimir(Data.FORMATO_12H); 
		d1.imprimir(Data.FORMATO_24H); 
	}
}
