package Exercicio01;

public class Aplicacao {

	public static void main(String[] args) {
		
		TratamentoException trat = new TratamentoException();
		
		ContaBancaria conta1 = new ContaBancaria();
		ContaBancaria conta2 = new ContaBancaria();
		ContaBancaria conta3 = new ContaBancaria();
		
		trat.realizarDeposito(-2000, conta3);
	}
}
