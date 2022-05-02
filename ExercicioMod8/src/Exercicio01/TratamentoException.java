package Exercicio01;

public class TratamentoException {
	public void realizarSaque(double valor, ContaBancaria conta) {
		
		try {
			conta.sacar(valor);
		} catch (ValorInvalidoException e) {
			System.out.printf("Valores negativos não podem ser sacados. Você tentou sacar: %.2f R$ %n%n" , e.getValor());
			
		} catch (SaldoInsuficienteException e) {
			System.out.printf("Você tentou sacar %.2f R$. Seu saldo disponível é: %.2f R$ %n%n", e.getValor(), e.getSaldo());
		}
	}
	
	public void realizarDeposito(double valor, ContaBancaria conta) {
		
		try {
			conta.depositar(valor);
		} catch (ValorInvalidoException e) {
			System.out.printf("Valores negativos não podem ser depositados. "
					+ "Você tentou depositar: %.2f R$. Tenta novamente com um valor válido %n%n", e.getValor());
					 
		}
	}
	
	public void realizarTransferencia(double valor, ContaBancaria conta, ContaBancaria contaDestino) {
		
		try {
			conta.transferir(valor, contaDestino);
		} catch (ValorInvalidoException e) {
			System.out.println("Transferência inválida. \n");
		} catch (SaldoInsuficienteException e) {
			System.out.println("Transferência inválida. \n");
		}
	}
}
