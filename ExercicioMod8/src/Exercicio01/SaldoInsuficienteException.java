package Exercicio01;


@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {
	private double valor;
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getValor() {
		return valor;
	}

	public SaldoInsuficienteException(double valor, double saldo) {
		this.valor = valor;
		this.saldo = saldo;
	}
	
	
}
