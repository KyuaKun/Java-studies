package Exercicio02;

public class ContaInvestimento extends ContaBancaria {

	private static final double RENDA = 0.05;

	@Override
	void depositar(double valor) {
		super.depositar(valor);
		System.out.printf("Deposito feito de: %.2f R$ na Conta Investimento \n", valor);
	}

	@Override
	void sacar(double valor) {
		super.sacar(valor);
		System.out.printf("Saque feito de: %.2f R$ na Conta Investimento \n", valor);
	}

	@Override
	void transferir(double valor, ContaBancaria conta) {
		super.transferir(valor, conta);
		System.out.printf("Transferência feita de: %.2f R$ na Conta Investimento", valor);
	}

	@Override
	void calcularSaldo() {
		super.calcularSaldo();
		double saldoFinal = saldo + (saldo * RENDA);
		System.out.printf("Saldo da sua Conta Investimento é: %.2f R$ (%.2f saldo mais %.2f R$ em renda) \n\n",
				saldoFinal, saldo, (saldo * RENDA));
	}

}
