package Exercicio01;

public class Aplicacao {

	public static void main(String[] args) {
		
		TratamentoException conta1 = new TratamentoException();
		TratamentoException conta2 = new TratamentoException();
		ContaBancaria conta3 = new ContaBancaria();
		
		conta1.realizarSaque(-200);
		conta1.realizarSaque(100000);
		conta2.realizarDeposito(-575);
		conta1.realizarTransferencia(-564, conta3);
	}
}
