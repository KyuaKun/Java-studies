package Exercicio02;

public class Fracao {
	double numerador;
	double denominador;
	
	public Fracao(double numerador, double denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public double fracaoCalcular(Fracao fracao){
		double numeResult = this.numerador * fracao.numerador;
		double denomResult = this.denominador * fracao.denominador;
		return numeResult/denomResult;
	}

	@Override
	public String toString() {
		return "Sua fra��o �: " + numerador+"/" + denominador + "\nOnde "+ numerador + " � seu numerador e "
			   + denominador + " � seu denomiador";
	}
}
