package Exercicio03;

public class Aplicacao {

	public static void main(String[] args) throws CloneNotSupportedException {
		Porta doBanheiro = new Porta("do banheiro", 3.1,1.2);
		doBanheiro.estadoPorta();
		doBanheiro.abrir();
		doBanheiro.estadoPorta();
		doBanheiro.imprimirDados();
		
		Porta doBanheiro2 = (Porta) doBanheiro.clone();
		doBanheiro2.imprimirDados();
	}

}
