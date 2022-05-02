package Exercicio01;

public class ContaBancaria {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}
	
	

	public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);

		} else if (valor > this.saldo) {
			throw new SaldoInsuficienteException(valor, saldo);

		}

		saldo -= valor;

	}

	public void depositar(double valor) throws ValorInvalidoException {
		if (valor <= 0) {
			throw new ValorInvalidoException(valor);
		}

		saldo += valor;
	}

	public void transferir(double valor, ContaBancaria conta)
			throws ValorInvalidoException, SaldoInsuficienteException {
		sacar(valor);
		conta.depositar(valor);

	}
}
