package Exercicio01;

public class ContaBancaria {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) {

	}

	public void depositar(double valor) {

	}

	public void transferir(double valor, ContaBancaria conta) {
		sacar(valor);
		conta.depositar(valor);

	}
}
