package ControlerViewer;

public class Aplicacao {
	public static void main(String[] args) {
		Pessoa pessoa01 = new Pessoa("Vinícius", "Soares", "vinivsp@hotmail.com", 172291227,23, 4, 1997, 'M');
		pessoa01.imprimirPessoa();
		
		ContaBancaria conta01 = new ContaBancaria(pessoa01, 17918532, 2005, 23000, "Bradesco");
		conta01.imprimirCB();
		
		conta01.depositar(200);
		conta01.imprimirCB();

	}
}
