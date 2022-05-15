package Exercicio07;

public class Aplicacao {
	/*Crie uma aplicação que possibilita a entrada via console de um conjunto de notas de um aluno. 
	 *Assim que -1 for informado como nota, calcule a média das notas informadas anteriormente e 
	 *mostre na tela. Caso a nota do aluno seja inválida, mostre uma mensagem na tela solicitando 
	 *uma nova nota
	 */
	public static void main(String[] args) {
		//qtde de notas fornecidas para o aluno
		int qtdNotas = 0;

		//acumula a soma das notas
		double somaNotas= 0.0;

		//contador de iterações
		int i = 1;

		while(true) {
			System.out.print("Nota " + (i++) + ": ");
			double nota = Console.leitorDouble();

			if (nota == -1) {
				break;
			} else if (nota < 0 || nota >10) {
				System.out.println("A nota inserida é inválida");
				continue;
			}
			somaNotas += nota;
			qtdNotas++;
		}
		double media = somaNotas/qtdNotas;
		System.out.println("A média deste aluno é: "+media);
	}
}
