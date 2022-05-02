package Exercicio01;

public class Aplicacao {

	public static void main(String[] args) {
		
		TratamentoException trat = new TratamentoException();
		
		ContaBancaria conta1 = new ContaBancaria("Noah Abreu Albenaz");
		ContaBancaria conta2 = new ContaBancaria("Glauber Lucas Barrada");
		ContaBancaria conta3 = new ContaBancaria("Marisa Abreu Fontes");
		
		trat.realizarDeposito(-2000, conta1);
		trat.realizarSaque(200, conta2);
		trat.realizarTransferencia(50, conta1, conta3);
		
		trat.realizarDeposito(10000, conta1);
		trat.realizarDeposito(10000, conta2);
		trat.realizarDeposito(10000, conta3);
		
		trat.realizarSaque(877, conta1);
		trat.realizarTransferencia(428, conta2, conta3);
	}
}
