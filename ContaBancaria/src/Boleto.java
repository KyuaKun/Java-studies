package ControlerViewer;

public class Boleto {
	protected int id;
	protected double valorPagar;
	Pessoa destinatario;
	Endereco destino;
	
	public Boleto(int id, double valorPagar) {
		this.id = id;
		this.valorPagar = valorPagar;
	}
	
	public void Pagar(ContaBancaria pagar, double valor) {
		pagar.sacar(valor);
	}
	
	void enviar(Pessoa destinatario, Endereco destino) {
		this.destinatario = destinatario;
		this.destino = destino;
		
	}
	
	void imprimirBoleto() {
		System.out.printf("Número de identificação do boleto: %05d \n", id);
		System.out.printf("Valor a pagar: %.2f R$ \n", valorPagar);
	}
}


