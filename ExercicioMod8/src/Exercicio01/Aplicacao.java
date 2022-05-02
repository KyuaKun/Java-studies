package Exercicio01;

public class Aplicacao {

	public static void main(String[] args) {
		
		TratamentoException trat = new TratamentoException();
		
		ContaBancaria conta1 = new ContaBancaria();
		ContaBancaria conta2 = new ContaBancaria();
		ContaBancaria conta3 = new ContaBancaria();
		
		trat.realizarDeposito(-2000, conta1);
		trat.realizarSaque(200, conta2);
		trat.realizarTransferencia(50, conta1, conta3);
		
		trat.realizarDeposito(100, conta1);
	}
}
