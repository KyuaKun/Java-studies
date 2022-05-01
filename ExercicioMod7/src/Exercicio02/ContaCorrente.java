package Exercicio02;

public class ContaCorrente extends ContaBancaria {

	private static final double TRIBUTO = 0.1;

	@Override
	void depositar(double valor) {
		super.depositar(valor);
		System.out.printf("Deposito feito de: %.2f R$ na Conta Corrente \n", valor);
	}

	@Override
	void sacar(double valor) {
		super.sacar(valor);
		System.out.printf("Saque feito de: %.2f R$ na Conta Corrente \n", valor);
	}

	@Override
	void transferir(double valor, ContaBancaria conta) {
		super.transferir(valor, conta);
		System.out.printf("Transferência feita de: %.2f R$ na Conta Corrente", valor);
	}

	@Override
	void calcularSaldo() {
		super.calcularSaldo();
		double saldoFinal = saldo - (saldo * TRIBUTO);
		System.out.printf("Saldo da sua Conta Corrente é: %.2f R$ (%.2f saldo menos %.2f R$ em tributos) \n\n",
				saldoFinal, saldo, (saldo * TRIBUTO));
	}

}
