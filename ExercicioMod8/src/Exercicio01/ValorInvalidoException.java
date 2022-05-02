package Exercicio01;


@SuppressWarnings("serial")
public class ValorInvalidoException extends Exception {
	private double valor;

	public double getValor() {
		return valor;
	}

	public ValorInvalidoException(double valor) {
		this.valor = valor;
	}
	
	
}
