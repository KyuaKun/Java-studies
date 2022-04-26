

public class ContaBancaria{
	protected int contaCorrente, agencia;
	protected double saldo;
	protected String nomeBanco;
	Pessoa titular;
	
	public ContaBancaria (Pessoa p, int contaCorrente, int agencia, double saldo, String nomeBanco){
		titular = p;
		this.contaCorrente = contaCorrente;
		this.agencia = agencia;
		this.saldo = saldo;
		this.nomeBanco = nomeBanco;
	}
	
	void sacar(double valor) {
		saldo -= valor;
	}
	void depositar(double valor) {
		saldo += valor;
	}
	
	void transferir(ContaBancaria destino, double valor) {
		sacar(valor);
		destino.depositar(valor);
	}
	
	void pagarBoleto(Boleto id) {
		
	}
	
	public void imprimirCB() {
		System.out.println("Número da Conta Corrente: " + contaCorrente);
		System.out.println("Número da Agência: " + agencia);
		System.out.printf("Saldo atual: %.2f R$ ", saldo);
		System.out.printf("\n");
		System.out.println("Nome do Banco: " + nomeBanco);
	}
}
