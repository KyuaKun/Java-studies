package Exercicio07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
	public static String leitorString() {
		try {
			BufferedReader leitor = new BufferedReader (new InputStreamReader(System.in));
			return leitor.readLine();
		} catch (IOException e) {
			throw new RuntimeException ("Erro ao ler o dado do teclado");
		}
	}

	public static int leitorInt() {
		String intFormatado = leitorString();

		try {
			return Integer.parseInt(intFormatado);
		} catch (NumberFormatException e) {
			throw new RuntimeException ("Erro: " +intFormatado+ "não é um inteiro válido.");
		}
	}

	public static double leitorDouble() {
		String doubleFormatado = leitorString();

		try {
			return Double.parseDouble(doubleFormatado);
		} catch (NumberFormatException e) {
			throw new RuntimeException ("Erro: "+doubleFormatado+ "não é um double válido.");
		}
	}
}	
