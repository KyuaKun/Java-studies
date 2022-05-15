package Exercicio01;

public class ContaBancaria {

	private double saldo;
	private String nome;
	
	
	public double getSaldo() {
		return saldo;
	}
	
	
	public String getNome() {
		return nome;
	}


	public ContaBancaria(String nome) {
		this.nome = nome;
	}
	
	
	public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);

		} else if (valor > this.saldo) {
			throw new SaldoInsuficienteException(valor, saldo);

		}

		saldo -= valor;
		System.out.printf("Saque de %.2f R$ realizado com sucesso! Saldo atual de: %.2f R$ %n%n", valor, saldo);
	}

	public void depositar(double valor) throws ValorInvalidoException {
		if (valor <= 0) {
			throw new ValorInvalidoException(valor);
		}

		saldo += valor;
		System.out.printf("%s realizou um deposito de %.2f R$ na sua conta! Saldo atual de: %.2f R$ %n%n", nome, valor, saldo);
		
	}

	public void transferir(double valor, ContaBancaria conta)
			throws ValorInvalidoException, SaldoInsuficienteException {
		sacar(valor);
		conta.depositar(valor);
		System.out.printf("%s realizou uma transferência de %.2f R$! %n%n", nome , valor);
	}
}
