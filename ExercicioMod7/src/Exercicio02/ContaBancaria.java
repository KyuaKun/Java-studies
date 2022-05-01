package Exercicio02;

public abstract class ContaBancaria {
	protected double saldo;

	public double getSaldo() {
		return saldo;
	}

	void depositar(double valor) {
		saldo+= valor;
	}
	
	void sacar (double valor) {
		saldo -= valor;
	}
	
	void transferir (double valor, ContaBancaria conta) {
		sacar(valor);
		conta.transferir(valor, conta);
	}
	
	void calcularSaldo() {
		
	}
}
