package Exercicio06;

import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		int dia, mes, ano;
		Scanner data = new Scanner(System.in);

		System.out.println("Digite um dia: ");
		dia = data.nextInt();
		if(dia <= 0 || dia > 31) {
			System.out.println("Dia inv�lido.");
		} else {
			System.out.println("Digite um mes: ");
			mes = data.nextInt();
			if (mes < 1 || mes >= 13){
				System.out.println("M�s inv�lido.");
			} else if (mes == 2 && dia <= 0 || dia > 28) {
				System.out.println("Data inv�lida. Fevereiro n�o possui mais de 28 dias.");
			}else {
				System.out.println("Digite um ano: ");
				ano = data.nextInt();
				if (ano <0) {
					System.out.println("Ano inv�lido.");
				} else {
					System.out.println(dia + "/" + mes + "/" + ano);
				}
			}
		}
		data.close();
	}
}

