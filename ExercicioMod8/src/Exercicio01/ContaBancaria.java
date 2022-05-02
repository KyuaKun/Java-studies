package Exercicio01;

public class ContaBancaria {

	private double saldo;
	private double nome;
	
	
	public double getSaldo() {
		return saldo;
	}
	
	
	
	public double getNome() {
		return nome;
	}



	public void setNome(double nome) {
		this.nome = nome;
	}


	public ContaBancaria(double nome) {
		this.nome = nome;
	}
	
	
	public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);

		} else if (valor > this.saldo) {
			throw new SaldoInsuficienteException(valor, saldo);

		}

		saldo -= valor;
		System.out.printf("Saque de %.2f R$ realizado com sucesso! Saldo atual: %.2f R$ %n%n", valor, saldo);
	}

	public void depositar(double valor) throws ValorInvalidoException {
		if (valor <= 0) {
			throw new ValorInvalidoException(valor);
		}

		saldo += valor;
		System.out.printf("Deposito de %.2f R$ feito na sua conta! Saldo atual: %.2f R$ %n%n", valor, saldo);
		
	}

	public void transferir(double valor, ContaBancaria conta)
			throws ValorInvalidoException, SaldoInsuficienteException {
		sacar(valor);
		conta.depositar(valor);
		System.out.printf("Transferência de %.2f realizada com sucesso! %n%n");
	}
}
