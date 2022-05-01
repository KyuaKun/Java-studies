package Exercicio02;

public class Aplicacao {
	public static void main(String[] args) {

		ContaBancaria ci = new ContaInvestimento();
		ContaBancaria cc = new ContaCorrente();

		cc.depositar(3300);
		cc.calcularSaldo();

		ci.depositar(800);
		ci.calcularSaldo();

		cc.sacar(489);
		cc.calcularSaldo();

		ci.sacar(56);
		ci.calcularSaldo();

	}
}
