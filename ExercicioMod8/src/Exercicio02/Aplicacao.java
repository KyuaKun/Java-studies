package Exercicio02;

public class Aplicacao {

	@SuppressWarnings("null")
	public static void main(String[] args) {	
		
		Object o = null;
		
		try {
			o.toString();
		} catch (NullPointerException e) {
			System.out.println("Este método está sendo chamado de um objeto com valor nulo.");
		}
		
		System.out.println("Fim da aplicação.");
	}

}
