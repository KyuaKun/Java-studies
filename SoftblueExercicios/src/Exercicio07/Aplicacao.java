package Exercicio07;

public class Aplicacao {
	/*Crie uma aplica��o que possibilita a entrada via console de um conjunto de notas de um aluno. 
	 *Assim que -1 for informado como nota, calcule a m�dia das notas informadas anteriormente e 
	 *mostre na tela. Caso a nota do aluno seja inv�lida, mostre uma mensagem na tela solicitando 
	 *uma nova nota
	 */
	public static void main(String[] args) {
		//qtde de notas fornecidas para o aluno
		int qtdNotas = 0;

		//acumula a soma das notas
		double somaNotas= 0.0;

		//contador de itera��es
		int i = 1;

		while(true) {
			System.out.print("Nota " + (i++) + ": ");
			double nota = Console.leitorDouble();

			if (nota == -1) {
				break;
			} else if (nota < 0 || nota >10) {
				System.out.println("A nota inserida � inv�lida");
				continue;
			}
			somaNotas += nota;
			qtdNotas++;
		}
		double media = somaNotas/qtdNotas;
		System.out.println("A m�dia deste aluno �: "+media);
	}
}
