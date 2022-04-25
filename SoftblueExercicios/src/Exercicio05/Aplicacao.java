package Exercicio05;

import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha um número: ");
		int x = sc.nextInt();
		
		while (x <= 1000) {
			switch (x % 2) {
			case 0: x+=5;
			break;
			
			default: x*=2;
			}
			System.out.print(x + ", ");
		}
		sc.close();
	}
}
