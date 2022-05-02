package Exercicio01;

public class TratamentoException {
	public void realizarSaque(double valor) {
		ContaBancaria cb = new ContaBancaria();
		
		try {
			cb.sacar(valor);
		} catch (ValorInvalidoException e) {
			System.out.printf("Valores negativos n�o podem ser sacados. Voc� tentou sacar: %.2f R$ %n%n" , e.getValor());
			
		} catch (SaldoInsuficienteException e) {
			System.out.printf("Voc� tentou sacar %.2f R$. Seu saldo dispon�vel �: %.2f R$ %n%n", e.getValor(), e.getSaldo());
		}
	}
	
	public void realizarDeposito(double valor) {
		ContaBancaria cb = new ContaBancaria();
		
		try {
			cb.depositar(valor);
		} catch (ValorInvalidoException e) {
			System.out.printf("Valores negativos n�o podem ser depositados. "
					+ "Voc� tentou depositar: %.2f R$. Tenta novamente com um valor v�lido %n%n", e.getValor());
					 
		}
	}
	
	public void realizarTransferencia(double valor, ContaBancaria conta) {
		ContaBancaria cb = new ContaBancaria();
		
		try {
			cb.transferir(valor, conta);
		} catch (ValorInvalidoException e) {
			System.out.println("Transfer�ncia inv�lida. \n");
		} catch (SaldoInsuficienteException e) {
			System.out.println("Transfer�ncia inv�lida. \n");
		}
	}
}
